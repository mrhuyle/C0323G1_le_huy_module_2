package case_study.furama_resort.service.implement_;

import case_study.furama_resort.common.ReadWriteFile;
import case_study.furama_resort.model.Booking;
import case_study.furama_resort.repository.implement_.BookingRepository;
import case_study.furama_resort.repository.interface_.IBookingRepository;
import case_study.furama_resort.repository.interface_.ICustomerRepository;
import case_study.furama_resort.service.interface_.IBookingService;
import case_study.furama_resort.service.interface_.ICustomerService;
import case_study.furama_resort.service.interface_.IFacilityService;
import case_study.furama_resort.utils.Validate;

import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static IBookingRepository bookingRepository = new BookingRepository();
    private static ICustomerService customerService = new CustomerService();
    private static IFacilityService facilityService = new FacilityService();
    @Override
    public void displayList() {
        TreeSet<Booking> bookingTreeSet = bookingRepository.getAll();
        for (Booking booking: bookingTreeSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void add() {
        //Display list of customers and facilities
        System.out.println("******************* LIST OF CUSTOMERS *******************");
        customerService.displayList();
        System.out.println("");
        System.out.println("******************* LIST OF FACILITIES *******************");
        facilityService.displayList();

        //Input booking information:
        //Input customer code:
        System.out.println("Input customer code: ");
        String customerCode;
        do {
            customerCode = scanner.nextLine();
            if (!Validate.validateCustomerCode(customerCode)) {
                System.err.println("Invalid customer code");
                continue;
            }
            if (customerService.getByCode(customerCode) == null) {
                System.err.println("Do not find the customer. Try again");
                continue;
            }
            break;
        } while (true);

        //Input facility code:
        String facilityCode;
        do {
            System.out.println("Input facility code: ");
            facilityCode = scanner.nextLine();
            if (!Validate.validateFacilityCode(facilityCode)) {
                System.err.println("Invalid facility code");
                continue;
            }
            if (facilityService.getFacilityByCode(facilityCode) == null) {
                System.err.println("Do not find the facility. Try again.");
                continue;
            }
            break;
        } while (true);

        //Input booking code:
        String bookingCode;
        do {
            System.out.println("Input booking code");
            bookingCode = scanner.nextLine();
            //Define bookingCode format: BO-YYYY
            if (!Validate.validateBookingCode(bookingCode)) {
                System.err.println("Invalid booking code. The code must be BO-YYYY.");
                continue;
            }
            break;
        } while (true);

        //Input date of booking:
        String dateBook;
        do {
            System.out.println("Input date of booking: ");
            dateBook = scanner.nextLine();
            if (!Validate.validateDate(dateBook)) {
                System.err.println("Invalid date. Input again.");
                continue;
            }
            break;
        } while (true);

        //Input begin date of rent:
        String beginDateRent;
        do {
            System.out.println("Input beginning date of rent: ");
            beginDateRent = scanner.nextLine();
            if (!Validate.validateDate(beginDateRent)) {
                System.err.println("Invalid date. Input again.");
                continue;
            }
            break;
        } while (true);

        //Input end date of rent:
        String endDateRent;
        do {
            System.out.println("Input end date of rent: ");
            endDateRent = scanner.nextLine();
            if (!Validate.validateDate(endDateRent)) {
                System.err.println("Invalid date. Input again.");
                continue;
            }
            break;
        } while (true);

        //Create new booking:
        Booking newBooking = new Booking(bookingCode,dateBook,beginDateRent,endDateRent,customerService.getByCode(customerCode),facilityService.getFacilityByCode(facilityCode));

        //Add and Write file in repo:
        bookingRepository.add(newBooking);
    }
}

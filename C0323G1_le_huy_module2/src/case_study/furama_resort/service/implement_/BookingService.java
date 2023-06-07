package case_study.furama_resort.service.implement_;

import case_study.furama_resort.repository.interface_.ICustomerRepository;
import case_study.furama_resort.service.interface_.IBookingService;
import case_study.furama_resort.service.interface_.ICustomerService;
import case_study.furama_resort.service.interface_.IFacilityService;
import case_study.furama_resort.utils.Validate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerService customerService = new CustomerService();
    private static IFacilityService facilityService = new FacilityService();
    @Override
    public void displayList() {

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
            bookingCode = scanner.nextLine();

        } while (true);
    }
}

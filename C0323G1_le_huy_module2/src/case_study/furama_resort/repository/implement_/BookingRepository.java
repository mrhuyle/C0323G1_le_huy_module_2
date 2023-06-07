package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.common.ReadWriteFile;
import case_study.furama_resort.model.Booking;
import case_study.furama_resort.model.Customer;
import case_study.furama_resort.model.Facility;
import case_study.furama_resort.repository.interface_.IBookingRepository;
import case_study.furama_resort.service.implement_.CustomerService;
import case_study.furama_resort.service.implement_.FacilityService;
import case_study.furama_resort.service.interface_.ICustomerService;
import case_study.furama_resort.service.interface_.IFacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static final String BOOKING_PATH = "src/case_study/furama_resort/data/booking";
    private static ICustomerService customerService = new CustomerService();
    private static IFacilityService facilityService = new FacilityService();
    private static TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());

    @Override
    public TreeSet<Booking> getAll() {
        bookingTreeSet.clear();
        List<String> bookingList = ReadWriteFile.readFile(BOOKING_PATH);
        for (String str : bookingList) {
            if (str != null) {
                String[] info = str.split(",");
                Booking booking = new Booking(info[0], info[1], info[2], info[3], customerService.getByCode(info[4]), facilityService.getFacilityByCode(info[5]));
                bookingTreeSet.add(booking);
            }
        }
        return bookingTreeSet;
    }

    @Override
    public void add(Booking newBooking) {
        bookingTreeSet = getAll();
        bookingTreeSet.add(newBooking);
        List<String> stringList = new ArrayList<>();
        stringList.add(getInfo(newBooking));
        ReadWriteFile.writeFile(BOOKING_PATH, stringList, true);
    }

    @Override
    public String getInfo(Booking booking) {
        String info;
        info = booking.getCode() + "," + booking.getDateBook() + "," + booking.getBeginDateRent() + "," + booking.getEndDateRent() + "," + booking.getCustomer().getCode() + "," + booking.getFacility().getCode();
        return info;
    }
}

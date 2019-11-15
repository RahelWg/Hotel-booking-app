package romaniancoder.bookingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner{
    private BookingRepository bookingRepository;
@Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
    this.bookingRepository = bookingRepository;
    }

    @Override
    public  void run(String... strings) throws Exception {
        List<hotelbooking> bookings = new ArrayList<>();

        bookings.add(new hotelbooking("Marriot", 200, 3));
        bookings.add(new hotelbooking("Ibis", 90, 4));
        bookings.add(new hotelbooking("novotel", 140, 1));

        bookingRepository.saveAll(bookings);
    }

    }


package romaniancoder.bookingdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<hotelbooking, Long> {
     List<hotelbooking>findByPricePerNightLessThan(double price);

    void delete(long id);
}
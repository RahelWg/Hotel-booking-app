package romaniancoder.bookingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/bookings")
public class  BookingController {

    private BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<hotelbooking> getAll(){
        return bookingRepository.findAll();
    }
    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public  List<hotelbooking> getaffordable(@PathVariable double price){
        return bookingRepository.findByPricePerNightLessThan(price);

    }
    @RequestMapping(value = "/Create", method = RequestMethod.POST)
    public List<hotelbooking> create(@RequestBody hotelbooking Hotelbooking){
        bookingRepository.save(Hotelbooking);
        return bookingRepository.findAll();
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<hotelbooking> remove(@PathVariable long id){
        bookingRepository.delete(id);
        return bookingRepository.findAll();

    }

   /* public void setHotelbooking(Object hotelbooking) {
        this.hotelbooking = hotelbooking;
    }*/
}

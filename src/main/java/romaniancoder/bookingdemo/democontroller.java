package romaniancoder.bookingdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller  {
       @RequestMapping("/hello")
    public String hello(){
           return "Hello";
       }
}

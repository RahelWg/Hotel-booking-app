package romaniancoder.bookingdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class hotelbooking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;
    public hotelbooking(){}

   /* public hotelbooking(String hotelName, double pricePerNight, int nbOfNights ) {
    }*/

    public hotelbooking(String hotelName, double pricePerNight, int nbOfNights){
           this.hotelName = hotelName;
           this.pricePerNight = pricePerNight;
           this.nbOfNights = nbOfNights;

    }

    public int getNbOfNights() {
        return nbOfNights;
    }
    public String getHotelName() {
        return hotelName;
    }
    public double getPricePerNight(){
        return pricePerNight;
    }
    public double getTotalPrice(){
        return pricePerNight * nbOfNights;
    }
    public long getId(){
        return id;
    }
}

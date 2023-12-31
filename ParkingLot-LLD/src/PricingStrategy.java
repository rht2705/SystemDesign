public class PricingStrategy {
    ParkingSpot parkingSpot;

    public int price( Ticket ticket){
        return parkingSpot.getPrice();
    }


}

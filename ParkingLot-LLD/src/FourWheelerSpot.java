public class FourWheelerSpot extends ParkingSpot{

    private final int FOUR_WHEELER_PRICE=20;

    FourWheelerSpot(){
        this.setPrice(FOUR_WHEELER_PRICE);
    }

    public int getFOUR_WHEELER_PRICE() {
        return FOUR_WHEELER_PRICE;
    }
}

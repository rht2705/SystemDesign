public class TwoWheelerSpot extends ParkingSpot{
    private final int TWO_WHEELER_PRICE=40;

    TwoWheelerSpot(){
        this.setPrice(TWO_WHEELER_PRICE);
    }

    public int getFOUR_WHEELER_PRICE() {
        return TWO_WHEELER_PRICE;
    }

}

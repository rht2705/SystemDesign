import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> totalParkingSpot;

    ParkingSpotManager(List<ParkingSpot> list){
        this.totalParkingSpot = list;
    }


    public int findParkingSpace(Vehicle vehicle){

        return 0;
    }

    public void bookParkingSpace(Vehicle vehicle){
    }

    public void addParkingSpace(){

    }

    public void removeParkingSpace(){

    }

    public void parkVehicle(){

    }

    public List<ParkingSpot> getTotalParkingSpot() {
        return totalParkingSpot;
    }

    public void setTotalParkingSpot(List<ParkingSpot> totalParkingSpot) {
        this.totalParkingSpot = totalParkingSpot;
    }
}

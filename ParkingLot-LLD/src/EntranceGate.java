public class EntranceGate {
    Vehicle vehicle;
    Long entryTime;

    ParkingManagerFactory parkingManagerFactory;
    ParkingSpotManager parkingSpotManager;

    Ticket ticket;


    public EntranceGate(Vehicle vehicle, Long entryTime) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpotManager = parkingManagerFactory.getParkingManger(vehicle.getVehicleType());
    }


    //if more than One entry pass EntryGate Name also
    public int findSpace(Vehicle Vehicle){
        return parkingSpotManager.findParkingSpace(Vehicle);
    }

    public void bookSpot(Vehicle Vehicle){
        parkingSpotManager.bookParkingSpace(Vehicle);

    }

    public void generateTicket(Vehicle vehicle, ParkingSpot parkingSpot, Long entryTime){
        this.ticket.spot=parkingSpot;
        this.ticket.vehicle= vehicle;
        this.ticket.entryTime=entryTime;
    }
}

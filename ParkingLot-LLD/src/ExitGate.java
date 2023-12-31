public class ExitGate {
    Ticket ticket;
    CostComputaion obj;
    CostComputaionFactory costComputaionFactory;

    ParkingManagerFactory parkingManagerFactory;
    ParkingSpotManager parkingSpotManager;


    public ExitGate(Ticket ticket) {
        this.ticket = ticket;
        this.obj=costComputaionFactory.getCostComptaionObj(ticket.vehicle.getVehicleType());
        this.parkingSpotManager = parkingManagerFactory.getParkingManger(ticket.vehicle.getVehicleType());

    }

    public int PriceCalculation(){
        return obj.price();
    }

    payment():

    public void removeVechile(){
        parkingSpotManager.removeParkingSpace();
    }


}

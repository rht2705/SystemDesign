public class ParkingManagerFactory {

    public   ParkingSpotManager  getParkingManger(Vehicle.VehicleType vehicleType){
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerManager();
            case FOUR_WHEELER:
                return new FourWheelerManager();
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }
    }

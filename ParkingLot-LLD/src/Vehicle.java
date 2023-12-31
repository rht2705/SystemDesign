public class Vehicle {

        String vehicleNo;
        VehicleType vehicleType;

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Constructor
        public Vehicle(String vehicleNo, VehicleType vehicleType) {
            this.vehicleNo = vehicleNo;
            this.vehicleType = vehicleType;
        }

        // Getter and setter methods if needed

        // Enum for vehicle types
        public enum VehicleType {
            TWO_WHEELER,
            FOUR_WHEELER
        }
}
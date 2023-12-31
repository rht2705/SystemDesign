public class CostComputaionFactory {

    public   CostComputaion  getCostComptaionObj(Vehicle.VehicleType vehicleType){
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerCostC();
            case FOUR_WHEELER:
                return new FourWheelerCostC();
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }
}

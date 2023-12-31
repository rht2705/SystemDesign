public class CostComputaion {

    PricingStrategy pricingStrategy;
    Ticket ticket;
    public CostComputaion(PricingStrategy pricingStrategy) {
        this.pricingStrategy=pricingStrategy;
    }

    public int price(){
         pricingStrategy.price(ticket);
        return 0;
    }
}

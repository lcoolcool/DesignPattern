package Strategy.DiscountStrategy;

public class MulStrategy extends Strategy{
    double discountRate;

    public MulStrategy(double discountRateValue){
        this.discountRate = discountRateValue;
    }

    @Override
    public double acceptDiscount(int num, double price) {
        return num * price * discountRate;
    }
}

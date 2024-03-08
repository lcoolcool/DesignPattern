package Strategy.DiscountStrategy;

public class NormalStrategy extends Strategy{
    @Override
    public double acceptDiscount(int num, double price) {
        return num * price;
    }
}

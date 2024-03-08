package Strategy.DiscountStrategy;

public class SubStrategy extends Strategy{
    int total, sub;

    public SubStrategy(int totalValue, int subValue){
        this.total = totalValue;
        this.sub = subValue;
    }

    @Override
    public double acceptDiscount(int num, double price) {
        return num * price - (int)((num * price)/total) * sub;
    }
}

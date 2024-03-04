package SimpleFactory.DiscountExample;

public class DiscountMul extends Discount {
    private double discountNum = 1d;

    public DiscountMul(double value){
        this.discountNum = value;
    }

    @Override
    public double acceptDiscount(int num, double price) {
        return num * price * this.discountNum;
    }
}

package SimpleFactory.DiscountExample;

public class DiscountSub extends Discount {
    private double value1 = 0d;
    private double value2 = 0d;


    public DiscountSub(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public double acceptDiscount(int num, double price) {
        double total = num * price;
        return total - (int)(total/this.value1) * this.value2;
    }
}

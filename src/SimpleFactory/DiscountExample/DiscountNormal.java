package SimpleFactory.DiscountExample;

public class DiscountNormal extends Discount {
    @Override
    public double acceptDiscount(int num, double price){
        return num * price;
    }
}

package SimpleFactory.DiscountExample;

public class DiscountFactory {
    public static Discount createDiscount(String[] args){
        return switch (args[0]){
            case  "2" -> new DiscountMul(Double.parseDouble(args[0]));
            case  "3" -> new DiscountSub(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
            default -> new DiscountNormal();
        };
    }
}

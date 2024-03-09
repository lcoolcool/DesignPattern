package SimpleFactory.DiscountExample;

public class DiscountFactory {
    public static Discount createDiscount(String[] args){
        return switch (args[0]){
            case  "2" -> new DiscountMul(Double.parseDouble(args[1]));
            case  "3" -> new DiscountSub(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
            default -> new DiscountNormal();
        };
    }
}

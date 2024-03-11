package Strategy.DiscountStrategyPlus;
import Strategy.DiscountStrategy.*;

public class DiscountStrategyPlusContext {
    Strategy strategy;

    public DiscountStrategyPlusContext(String[] discountParam){
        this.strategy = switch (discountParam[0]){
            case "2" -> new MulStrategy(Double.parseDouble(discountParam[1]));
            case "3" -> new SubStrategy(Integer.parseInt(discountParam[1]), Integer.parseInt(discountParam[2]));
            default -> new NormalStrategy();
        };
    }

    public double contextInterface(int num, double price){
        return strategy.acceptDiscount(num, price);
    }

}

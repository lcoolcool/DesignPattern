package Strategy.DiscountStrategy;

public class DiscountStrategyContext {
    Strategy strategy;
    public DiscountStrategyContext(Strategy strategyValue){
        this.strategy = strategyValue;
    }

    public double contextInterface(int num, double price){
        return strategy.acceptDiscount(num, price);
    }
}

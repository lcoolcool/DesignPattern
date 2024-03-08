package Strategy.StrategyExample;

public class Client {
    public static void main(String[] args){
        StrategyExampleContext content;

        content = new StrategyExampleContext(new StrategyAExample());
        content.contextInterface();

        content = new StrategyExampleContext(new StrategyBExample());
        content.contextInterface();

        content = new StrategyExampleContext(new StrategyCExample());
        content.contextInterface();
    }
}

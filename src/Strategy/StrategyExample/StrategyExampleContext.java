package Strategy.StrategyExample;

public class StrategyExampleContext {
    StrategyExample strategyExample;

    // 初始化时传入具体的策略对象
    public StrategyExampleContext(StrategyExample strategy){
        this.strategyExample = strategy;
    }

    public void contextInterface(){
        // 根据具体策略对象，调用其算法的方法
        strategyExample.algorithmInterface();
    }
}

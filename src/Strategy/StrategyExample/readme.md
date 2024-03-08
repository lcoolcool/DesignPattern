## 策略模式伪代码

### 客户端实现
[Client](Client.java)

### Context类
用一个ContextCreateStrategy来配置，维护一个StrategyExamole对象
[StrategyExampleContext](StrategyExampleContext.java)

### 算法类
1) 抽象算法类 [StrategyExample](StrategyExample.java)
2) 算法A [StrategyAExample](StrategyAExample.java)
3) 算法B [StrategyBExample](StrategyBExample.java)
4) 算法C [StrategyCExample](StrategyCExample.java)
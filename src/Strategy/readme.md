# 策略模式

## 关注行为:
定义了算法家族，分别封装起来，它们之间可以相互替换，此模式让算法的变化，不会影响到使用算法的客户。

## 具体操作：
1) 策略类(抽象算法类)，定义所有支持的算法公共接口
2) 具体策略类，封装具体的算法或行为，继承于策略类(抽象算法类)
3) 用一个具体的Content上下文配置，来维护一个对策略类对象的引用

## Example Code:
1) 策略模式简单举例
    * [StrategyExample](StrategyExample)
2) 商品打折策略实现
    * [DiscountStrategy](DiscountStrategy)
3) 策略与简单工厂结合
   * [DiscountStrategyPlus](DiscountStrategyPlus)
   * 通过与 [SimpleFactory.DiscountExample.DiscountClient](../SimpleFactory/DiscountExample/DiscountClient.java) 比较我们
   可以发现，简单工厂模式需要客户端去认识两个类(工厂类和实现对象类)，而策略模式与工厂模式结合的用法，客户端就只需要认识一个Context类就可以了，
   耦合更加降低。
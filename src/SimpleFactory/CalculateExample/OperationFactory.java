package SimpleFactory.CalculateExample;

public class OperationFactory {
    public static Operation createOperate(String operate){
        return switch (operate){
            case "+" -> new Add();
            case "-" -> new Sub();
            case "*" -> new Mul();
            case "/" -> new Div();
            default -> throw new ArithmeticException("运算符输入有误！");
        };
    }
}

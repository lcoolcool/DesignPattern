package SimpleFactory.CalculateExample;

import java.util.Scanner;

public class CalculateObject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A: ");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("请输入运算符号(+、-、*、/): ");
        String strOperate = sc.nextLine();
        System.out.println("请输入数字B: ");
        double numberB = Double.parseDouble(sc.nextLine());
        Operation operation = OperationFactory.createOperate(strOperate);
        double result = operation.getResult(numberA, numberB);
        System.out.println("输出结果为： " + result);
    }
}

package SimpleFactory;

import java.util.Scanner;

public class CalculateBad {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字A: ");
            Double numberA = Double.parseDouble(sc.nextLine());
            System.out.println("请输入运算符号(+、-、*、/): ");
            String strOperate = sc.nextLine();
            System.out.println("请输入数字B: ");
            Double numberB = Double.parseDouble(sc.nextLine());
            double result = 0d;

            switch (strOperate) {
                case "+":
                    result = numberA + numberB;
                    break;
                case "-":
                    result = numberA - numberB;
                    break;
                case "*":
                    result = numberA * numberB;
                    break;
                case "/":
                    result = numberA / numberB;
                    break;
                default:
                    throw new Exception("运算符输入有误");
            }
            System.out.println("输出结果为：" + result);
        }
        catch (Exception e){
            System.out.println("您的输入有误：" + e.toString());
        }
    }
}

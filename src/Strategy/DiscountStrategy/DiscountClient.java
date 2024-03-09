package Strategy.DiscountStrategy;

import java.util.Scanner;

public class DiscountClient {
    public static void main(String[] args){
        int num;
        double price;
        double totalPrice;
        double total = 0d;
        String[] discountParam;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("请输入折扣类型：1.原价， 2.打折， 3.满减");
            int discountType = Integer.parseInt(sc.nextLine());
            if (discountType == 2) {
                System.out.println("请输入折扣率：（eg: 0.8）;");
                discountParam = new String[2];
                discountParam[0] = "2";
                discountParam[1] = sc.nextLine();
            } else if (discountType == 3) {
                discountParam = new String[3];
                discountParam[0] = "3";
                System.out.println("请输入满多少减钱：");
                discountParam[1] = sc.nextLine();
                System.out.println("请输入减多少钱：");
                discountParam[2] = sc.nextLine();
            }
            else {
                discountParam = new String[1];
                discountParam[0] = "1";
            }
            System.out.println("请输入商品单价：");
            price = Double.parseDouble(sc.nextLine());
            System.out.println("请输入商品数量：");
            num = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (price>0 && num>0){
                DiscountStrategyContext discountStrategyContext = getDiscountStrategyContext(discountParam);
                totalPrice = discountStrategyContext.contextInterface(num, price);
                total += discountStrategyContext.contextInterface(num, price);
                System.out.println();
                System.out.println("单价：" + price + "元 数量：" + num + " 合计：" + totalPrice + "元");
                System.out.println();
                System.out.println("总计：" + total + " 元");
            }
        }
        while (num>0 && price>0);

    }

    private static DiscountStrategyContext getDiscountStrategyContext(String[] discountParam) {
        return switch (discountParam[0]){
            case "2" -> new DiscountStrategyContext(new MulStrategy(Double.parseDouble(discountParam[1])));
            case "3" -> new DiscountStrategyContext(new SubStrategy(Integer.parseInt(discountParam[1]),
                    Integer.parseInt(discountParam[2])));
            default -> new DiscountStrategyContext(new NormalStrategy());
        };
    }
}

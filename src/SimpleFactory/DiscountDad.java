package SimpleFactory;

import java.util.Scanner;

public class DiscountDad {
    public static void main(String[] args){
        double price = 0d;
        int num = 0;
        double totalPrices = 0d;
        double total = 0d;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("请输入商品销售模式：1.原价 2.八折 3. 七折：");
            int discount = Integer.parseInt(sc.nextLine());
            System.out.println("请输入商品单价：");
            price = Double.parseDouble(sc.nextLine());
            System.out.println("请输入商品数量：");
            num = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (price>0 && num>0){
                totalPrices = switch (discount){
                    case 2 -> price * num * 0.8;
                    case 3 -> price * num * 0.7;
                    default -> price * num;
                };
                total += totalPrices;
                System.out.println();
                System.out.println("单价：" + price + "元 数量：" + num + " 合计：" + totalPrices + "元");
                System.out.println();
                System.out.println("总计：" + total + " 元");
            }
        }
        while (num > 0 && price > 0);
    }
}

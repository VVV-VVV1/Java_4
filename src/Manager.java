import java.util.Scanner;
public class Manager extends Shop{
    Scanner scanner = new Scanner(System.in);
    public void choice(){
        boolean y = true;
        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("посмотреть каталог товаров AGRICULTURAL_PRODUCTS: 1");
            System.out.println("посмотреть каталог товаров DAIRY_PRODUCTS: 2");
            System.out.println("посмотреть все списки товаров: 3");
            System.out.println("добавить товар в корзину: 4");
            System.out.println("купит все товары в корзине: 5");
            System.out.println("выйти из магазина: 6");
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    outer_AGRICULTURAL_PRODUCTS_product_list();
                    break;
                case 2:
                    outer_DAIRY_PRODUCTS_product_list();
                    break;
                case 3:
                    output_all_product_list();
                    break;
                case 4:
                    Basket();
                    break;
                case 5:
                    buy_products();
                    break;
                case 6: 
                    y = exit_shop();
                    break;
                default:
                    System.out.println("что-то не то");
                    break;
            }
            if(!y) break;
        }

    }
}

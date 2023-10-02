import java.util.Scanner;
public class Shop{
    Scanner scsnner = new Scanner(System.in);
    int x;
    Product_list pr1 = Product_list.AGRICULTURAL_PRODUCTS;
    Product_list pr2 = Product_list.DAIRY_PRODUCTS;
    public void output_all_product_list(){
        System.out.println(pr1 + ":");
        System.out.println(pr1.getName1()  + " " + pr1.getName2()  + " "+ pr1.getName3());
        System.out.println(pr2 + ":");
        System.out.println(pr2.getName1()  + " " + pr2.getName2()  + " " + pr2.getName3());

    }
    public void outer_AGRICULTURAL_PRODUCTS_product_list(){
        System.out.println(pr1 + ":");
        System.out.println(pr1.getName1()  + " " + pr1.getName2()  + " "+ pr1.getName3());
    }

    public void outer_DAIRY_PRODUCTS_product_list(){
        System.out.println(pr2 + ":");
        System.out.println(pr2.getName1()  + " " + pr2.getName2()  + " " + pr2.getName3());
    }
    public void Basket(){
        System.out.println("Из какого каталога вы хотите выбрать?");
        System.out.println("AGRICULTURAL_PRODUCTS: 1");
        System.out.println("DAIRY_PRODUCTS: 2");
        int input = scsnner.nextInt();
        if(input == 1){
            System.out.println("выберете продукт");
            System.out.println("shovel: 1");
            System.out.println("rake: 2");
            System.out.println("hoe: 3");
            input = scsnner.nextInt();
            switch (input){
                case 1:
                    x += 1100;
                    System.out.println("вы добавили shovel");
                    break;
                case 2:
                    x += 1100;
                    System.out.println("вы добавили rake");
                    break;
                case 3:
                    x += 1000;
                    System.out.println("вы добавили hoe");
                    break;
                default:
                    System.out.println("вы ввели что-то не то");
                    break;
            }
        } else if (input == 2) {
            System.out.println("выберете продукт");
            System.out.println("milk: 1");
            System.out.println("yogurt: 2");
            System.out.println("cheese: 3");
            input = scsnner.nextInt();
            switch (input){
                case 1:
                    x += 100;
                    System.out.println("вы добавили milk");
                    break;
                case 2:
                    x += 40;
                    System.out.println("вы добавили yogurt");
                    break;
                case 3:
                    x += 150;
                    System.out.println("вы добавили cheese");
                    break;
                default:
                    System.out.println("вы ввели что-то не то");
                    break;
            }
        }
        else{
            System.out.println("вы ввели что-то не то");
        }

    }
    public void buy_products(){
        System.out.println("К оплате: " + x + " рублей");
        System.out.println("Хорошего дня!");
        x = 0;
    }

    public boolean exit_shop() {
        if (x == 0) {
            System.out.println("Досвидание! хорошего дня");
            return false;
        } else {
            System.out.println("Вы не можете уйти не оплатив товар");
            return true;
        }
    }


}

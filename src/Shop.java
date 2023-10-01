public class Shop{
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
        x++;
    }
    public void buy_products(){
        System.out.println("К оплате: " + x * 15);
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

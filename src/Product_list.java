
public enum Product_list {
    DAIRY_PRODUCTS(1, "milk", "yogurt","cheese"),
    AGRICULTURAL_PRODUCTS(2,"shovel", "rake","hoe");

    private int i;
    private String name1;
    private String name2;
    private String name3;

    Product_list(int i, String name1, String name2, String name3) {
        this.i = i;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }

    public int getI() {
        return i;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }
}

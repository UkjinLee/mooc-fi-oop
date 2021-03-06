package week4;

public class Product {

    // price, amount and name
    // week4.Product t = new week4.Product("Banana", 1.1, 13);
    // t.printProduct();

    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void printProduct() {
//        Banana, price 1.1, amount 13
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}

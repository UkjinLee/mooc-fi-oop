public class Product {

    // price, amount and name
    // Product t = new Product("Banana", 1.1, 13);
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
        System.out.println("Product:: name=" + name + " price=" + price + " amount=" + amount);
    }
}

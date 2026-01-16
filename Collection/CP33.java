import java.util.Vector;

class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate stock value
    public double getStockValue() {
        return price * quantity;
    }
}

public class CP33 {
    public static void main(String[] args) {

        Vector<Product> products = new Vector<>();

        // Adding product objects
        products.add(new Product(1, "Pen", 10, 0));
        products.add(new Product(2, "Notebook", 50, 150));
        products.add(new Product(3, "Laptop", 35000, 1));

        // Display out-of-stock products
        System.out.println("Out of Stock Products:");
        for (Product p : products) {
            if (p.getQuantity() == 0) {
                System.out.println(p.getName());
            }
        }

        // Calculate total stock value
        double totalStockValue = 0;
        for (Product p : products) {
            totalStockValue += p.getStockValue();
        }
        System.out.println("\nTotal Stock Value: " + totalStockValue);

        // Display products with stock value > 10000
        System.out.println("High Value Products:");
        for (Product p : products) {
            if (p.getStockValue() > 10000) {
                System.out.println(p.getName());
            }
        }
    }
}

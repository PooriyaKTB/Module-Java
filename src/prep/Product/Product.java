package src.prep.Product;

public class Product {

    private String name;
    private double price;
    private int stockCount;

    public Product(String name, double price, int stockCount) {
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Exercise 1.2 ->
    public Product(Product currentProduct) {
        this(currentProduct.name, currentProduct.price, currentProduct.stockCount);
    }
    // <-

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public int getStockCount() {
        return this.stockCount;
    }

    public String toString() {
        if (price < 1) {
            return String.format("This product is %s, the price for it is %.0fp. Currently, there is %d of the product in stock.", this.name, this.price * 100, this.stockCount);
        } else if ((int) price == price) {
            return String.format("This product is %s, the price for it is £%.0f. Currently, there is %d of the product in stock.", this.name, this.price, this.stockCount);
        } else {
            return String.format("This product is %s, the price for it is £%.2f. Currently, there is %d of the product in stock.", this.name, this.price, this.stockCount);
        }
    }
}

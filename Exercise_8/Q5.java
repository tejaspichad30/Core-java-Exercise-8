package Exercise_8;

import java.util.ArrayList;

class Product {
    
    String name;
    double price;
    int quantity;

    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get the total price of the product based on quantity
    public double getTotalPrice() {
        return price * quantity;
    }

    // Method to update the quantity of the product
    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display product details
    public void displayProduct() {
        System.out.println(name + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalPrice());
    }
}

class ShoppingCart {
    // List to store products in the cart
    private ArrayList<Product> cart;

    // Constructor to initialize the cart
    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Method to add product to cart
    public void addProduct(Product product) {
        cart.add(product);
    }

    // Method to remove product from cart
    public void removeProduct(String productName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).name.equals(productName)) {
                cart.remove(i);
                System.out.println(productName + " has been removed from the cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }

    // Method to calculate the total price of all products in the cart
    public double calculateTotal() {
        double total = 0.0;
        for (Product product : cart) {
            total += product.getTotalPrice();
        }
        return total;
    }

    // Method to display the contents of the cart
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Product product : cart) {
                product.displayProduct();
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 800.00, 1);
        Product product2 = new Product("Smartphone", 500.00, 2);
        Product product3 = new Product("Headphones", 50.00, 3);

        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Displaying the cart
        cart.displayCart();

        // Displaying the total price
        System.out.println("Total Price: $" + cart.calculateTotal());

        // Removing a product from the cart
        cart.removeProduct("Smartphone");

        // Displaying the updated cart and total price
        cart.displayCart();
        System.out.println("Updated Total Price: $" + cart.calculateTotal());
    }
}

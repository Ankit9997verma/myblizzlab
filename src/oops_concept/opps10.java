package oops_concept;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to cart.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }
}

public class opps10 {
    public static void main(String[] args) {
        CartItem cart = new CartItem("Shoes", 2000, 2);
        cart.displayDetails();
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayDetails();
    }
}

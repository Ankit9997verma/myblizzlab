package oops_concept;

class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class oops4 {
    public static void main(String[] args) {
        Item i = new Item("I001", "Laptop", 60000);
        i.displayDetails();
        System.out.println("Total Cost for 2 items: " + i.calculateTotalCost(2));
    }
}

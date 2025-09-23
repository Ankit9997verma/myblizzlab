package Inheritance;

//File: RetailSystem.java
class Order {
 int orderId;
 String orderDate;

 Order(int orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 String getOrderStatus() {
     return "Order placed";
 }
}

class ShippedOrder extends Order {
 String trackingNumber;

 ShippedOrder(int orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 @Override
 String getOrderStatus() {
     return "Shipped, Tracking: " + trackingNumber;
 }
}

class DeliveredOrder extends ShippedOrder {
 String deliveryDate;

 DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }

 @Override
 String getOrderStatus() {
     return "Delivered on " + deliveryDate;
 }
}

public class RetailSystem {
 public static void main(String[] args) {
     DeliveredOrder d = new DeliveredOrder(101, "2025-09-20", "TRK123", "2025-09-23");
     System.out.println("Order ID: " + d.orderId + ", Status: " + d.getOrderStatus());
 }
}

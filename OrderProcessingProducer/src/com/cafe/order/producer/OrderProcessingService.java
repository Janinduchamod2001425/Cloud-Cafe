package com.cafe.order.producer;

public interface OrderProcessingService {
	// Display the menu
	public void displayMenu();
	
	// Place an order with item number and quantity
	public void placeOrder(int itemNo, int quantity);
	
	// Get the name of an item by its number
	String getItemName(int itemNo);
	
	// Get the price of an item by its number
	double getItemPrice(int itemNo);
	
	// Select the order type (Dine-in, TakeAway, Delivery)
	void selectOrderType(OrderType orderType);
	
	// Apply a discount to the total bill
    double applyDiscount(double totalAmount, DiscountType discountType);

    // Process payment for the order
    boolean processPayment(double totalAmount, PaymentType paymentType);
}

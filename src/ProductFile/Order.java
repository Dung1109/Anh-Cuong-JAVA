package ProductFile;

import java.util.Scanner;

public class Order {
	private String customerName;
	private Books book;
	private int quantity;

	public Order() {
	}

	public Order(String customerName, Books book, int quantity) {
		this.customerName = customerName;
		this.book = book;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return customerName + ";" + quantity +";" + book;
	}

	public void InputData(Scanner scanner, Books book) {
		System.out.print("Customer Name: ");
		this.customerName = scanner.nextLine();
		System.out.print("Quantity: ");
		this.quantity = scanner.nextInt();
		this.book = book;
		scanner.nextLine();
		
	}
	

}

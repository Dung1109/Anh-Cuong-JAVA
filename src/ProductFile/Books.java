package ProductFile;

import java.util.Scanner;

public class Books {
	private String bookID;
	private String bookNameString;
	private int yearOfManufacture;
	private String authorString;
	private double salePrice;

	public Books() {
	}

	public Books(String bookID, String bookNameString, int yearOfManufacture, String authorString, double salePrice) {
		this.bookID = bookID;
		this.bookNameString = bookNameString;
		this.yearOfManufacture = yearOfManufacture;
		this.authorString = authorString;
		this.salePrice = salePrice;
	}

	@Override
	public String toString() {
		return bookID + ";" + bookNameString + ";" + yearOfManufacture + ";" + authorString + ";" + salePrice + "\n";
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookNameString() {
		return bookNameString;
	}

	public void setBookNameString(String bookNameString) {
		this.bookNameString = bookNameString;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getAuthorString() {
		return authorString;
	}

	public void setAuthorString(String authorString) {
		this.authorString = authorString;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public void InputData(Scanner scanner) {
		System.out.print("Enter Book ID: ");
		this.bookID = scanner.nextLine();
		System.out.print("Enter Book Title: ");
		this.bookNameString = scanner.nextLine();
		System.out.print("Enter Year Manufature: ");
		this.yearOfManufacture = scanner.nextInt();
		System.out.print("Enter Author: ");
		scanner.nextLine();
		this.authorString = scanner.nextLine();
		System.out.print("Enter Sale Price: ");
		this.salePrice = scanner.nextDouble();
		scanner.nextLine();

	}

}

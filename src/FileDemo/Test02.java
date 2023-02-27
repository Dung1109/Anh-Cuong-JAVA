package FileDemo;

import ProductFile.Books;
import ProductFile.Order;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

    public static List<Order> BookList = new ArrayList<>();

    public static void main(String[] args) {


        Test02 test02 = new Test02();
//        test02.InputData();
//        test02.WriteToFile();
        test02.ReadFromFile();
//        test02.SortOrder();
//        List<Order> list = test02.ReadFromFile();
        for (Order o : BookList) {
            System.out.println(o);
        }

    }

    public void InputData() {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();
//        List<Order> BookList = new ArrayList<>();

        Books books01 = new Books();
        Order order01 = new Order();
        books01.InputData(scanner);
        order01.InputData(scanner, books01);

        Books books02 = new Books();
        Order order02 = new Order();
        books02.InputData(scanner);
        order02.InputData(scanner, books02);

        Books books03 = new Books();
        Order order03 = new Order();
        books03.InputData(scanner);
        order03.InputData(scanner, books03);

        BookList.add(order01);
        BookList.add(order02);
        BookList.add(order03);

        for (Order order : BookList) {
            System.out.println(order.toString());
        }

    }

    public  void WriteToFile() {
//        List<Order> BookList = new ArrayList<>();

        try {
//			FileWriter fileWriter = new FileWriter("E:\\Eclipse\\Test\\Books.txt");
            FileWriter fileWriter = new FileWriter("Book01.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Order order : BookList) {
                fileWriter.write(order.toString());
            }
            fileWriter.close();
            bufferedWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


//    public List<Order> ReadFromFile() {
//        List<Order> list = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader("Book01.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String lineString = "";
//            while (true) {
//                lineString = bufferedReader.readLine();
//                if (lineString == null) {
//                    break;
//                }
//                String[] txt = lineString.split(";");
//                String customerName = txt[0];
//                int quatity = Integer.parseInt(txt[1]);
//                String bookID = txt[2];
//                String title = txt[3];
//                int year = Integer.parseInt(txt[4]);
//                String author = txt[5];
//                double salePrice = Double.parseDouble(txt[6]);
//
//                // public Order(String customerName, Books book, int quantity)
//                // public Books(String bookID, String bookNameString, int yearOfManufacture, String authorString, double salePrice)
//                list.add(new Order(customerName, new Books(bookID, title, year, author, salePrice), quatity));
//            }
//
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//        return list;
//    }

    public static void ReadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("Book01.txt"))) {
            System.out.println("Read from file");
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(";");
                String customerName = txt[0];
                int quatity = Integer.parseInt(txt[1]);
                String bookID = txt[2];
                String title = txt[3];
                int year = Integer.parseInt(txt[4]);
                String author = txt[5];
                double salePrice = Double.parseDouble(txt[6]);

                // public Order(String customerName, Books book, int quantity)
                // public Books(String bookID, String bookNameString, int yearOfManufacture, String authorString, double salePrice)
                BookList.add(new Order(customerName, new Books(bookID, title, year, author, salePrice), quatity));
            }
        } catch (Exception e) {
//            System.out.println(e.getStackTrace());
        }
    }

        private void SortOrder () {
            List<Books> books = new ArrayList<>();
//		Collections.sort(books, new Comparator<Books>() {
//			@Override
//			public int compare(Books b1, Books b2) {
//				return (int) b1.getSalePrice().compareTo(b2.getSalePrice());
//			}
//		});
            for (Books bo : books) {
                System.out.println(books.toString());
            }


        }


    }

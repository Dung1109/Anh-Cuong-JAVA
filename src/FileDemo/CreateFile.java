//package FileDemo;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.UnsupportedEncodingException;
//
//import ProductFile.BusinessBook;
//
//public class CreateFile {
//	public static void main(String[] args) {
//		BusinessBook businessBook = new BusinessBook();
//		businessBook.setBookID("TCHT");
//		businessBook.setBookTitle("Tổ chức học tập");
//		businessBook.setAuthor("Peter Senge");
//		businessBook.setPrice(150.0);
//
//		/*
//		 * Create new file
//		 */
//		File file = new File("E:\\Eclipse\\FileDemo\\");
////		System.out.println(file.exists());
////		File file01 = new File("E:\\Eclipse\\FileDemo\\FileWriterDemo");
////		file01.mkdir();
////		File file02 = new File("E:\\Eclipse\\FileDemo\\FileWriterDemo\\data.txt");
////		file02.mkdir();
////		File file03 = new File("E:\\Eclipse\\FileDemo\\FileWriterDemo\\data1.txt");
////		try {
////			file03.createNewFile();
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
//
//		/*
//		 * Writing data into file
//		 */
//		try {
//			PrintWriter pr = new PrintWriter("E:\\Eclipse\\FileDemo\\FileWriterDemo\\data1.txt", "UTF-8");
//			pr.print("Java programing language learning ");
//			pr.println();
//			pr.print(businessBook);
//			pr.flush();
//			pr.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//
//		/*
//		 * Output Object write on a file.
//		 */
//
//
//
//
//
//
//
//
//
//
//
//
//
//	}
//
//}

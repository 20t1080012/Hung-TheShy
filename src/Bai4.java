import java.util.Scanner;

public class Bai4 {
	 public static double tinhchuvi(double r){
	        return r * 2 * 3.14;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double r;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhap ban kinh: ");
	        r = scanner.nextDouble();	   
	        System.out.println("Chu Vi Hinh Tron: "+ tinhchuvi(r));
	}

}

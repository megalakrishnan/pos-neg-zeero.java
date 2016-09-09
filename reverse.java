import java.util.Scanner;

public class simple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String d=new StringBuffer(s).reverse().toString();
		System.out.println(d);

	}

}

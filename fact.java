import java.util.Scanner;

public class simple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int f1=1;
		int f2=1;
		while(f1<=s)
		{
			f2=f2*f1;
			f1++;
		}
		System.out.println(f2);
		

	}

}

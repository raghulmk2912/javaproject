package star;
import java.util.Scanner;
public class stars {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			for( int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}

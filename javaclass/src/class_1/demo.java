package class_1;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar[] =new String[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		for(int i=0;i<5;i++)
		{
			ar[i]=s.nextLine();
		}
		System.out.println("the given names are:");
		for(int i=0;i<5;i++) {
			System.out.println(ar[i]);
		}
		
	}

}

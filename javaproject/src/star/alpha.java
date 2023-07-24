package star;
import java.util.*;
public class alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int b=(s.length());
		int c=(b-1);
		int v=0;
		int n=0;
		int m=0;
		int y=0;
		int h=0;
		for(int i=0;i<=c;i++) {
			if(s.charAt(i) == 'a') v++;
			if(s.charAt(i) == 'e') n++;
			if(s.charAt(i) == 'i') m++;
			if(s.charAt(i) == 'o') y++;
			if(s.charAt(i) == 'u') h++;
			
		}
		System.out.println("a"+" "+"="+ v);
		System.out.println("e"+" "+"="+ n);
		System.out.println("i"+" "+"="+ m);
		System.out.println("o"+" "+"="+ y);
		System.out.println("u"+" "+"="+ h);

	}

}

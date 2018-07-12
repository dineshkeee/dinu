package setrep;
import java.util.*;
public class Intreverse {
	public static void main(String args[]){
		int a,i;
		String b,t="";
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		 b=Integer.toString(a);
		for(i=b.length()-1;i>=0;i--){
			t=t+(b.charAt(i));
		}
		System.out.println(t);
	}
}

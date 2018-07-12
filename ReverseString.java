package setrep;
import java.util.*;
public class ReverseString {
	public static void main(String args[]){
		int i;
		String b="",a;
        System.out.println("Enter the String");
        Scanner in=new Scanner(System.in);
       a=in.next();
        for( i=a.length()-1;i>=0;i--){
        	b=b+(a.charAt(i));
        }
        System.out.println(b);
	}
}


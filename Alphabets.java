package set1;
import java.util.*;
public class Alphabets {
		public static void main(String args[]){
			 char a;
			 System.out.println("Enter the character");
			 Scanner in=new Scanner(System.in);
			 a=in.next().charAt(0);
			 if(a>=65&&a<=90||a>=97&&a<=122){
				 System.out.println("Alphabet");
			 }else{
				 System.out.println("Not Alphabet");
			 }
		}
}

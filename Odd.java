package set1;
import java.util.*;
public class Odd {
		public static void main(String args[]){
			int a;
			System.out.println("enter the number");
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			if(a<0){
				System.out.println("Invalid");
			}
			else if(a%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
		}

}

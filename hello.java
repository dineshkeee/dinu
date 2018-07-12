package set1;
import java.util.*;
public class hello {
	public static void main(String args[]){
	int n;
	String name="hello";
	System.out.println("enter the Number");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	while(n!=0){
		System.out.println(name);
		n--;
	}
	}
}

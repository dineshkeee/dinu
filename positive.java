package set1;
import java.util.*;
public class positive {
	public static void main(String[] args) {
	int a;
	System.out.println("enter the number");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	if(a>=1){
		System.out.println("the given number positive");
	}else if(a==0){
		System.out.println("the given number is zero");
	}
	else{
		System.out.println("the given number is negative");
	}
}
}
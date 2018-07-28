package set1;
import java.util.*;
public class arraySum {
	public static void main(String args[]){
		int a,b,i,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		int arr[]=new int[a];
		for(i=0;i<a;i++){
			arr[i]=in.nextInt();
		}for(i=1;i<=b;i++){
		    sum+=i;}System.out.println(sum);
	}
}


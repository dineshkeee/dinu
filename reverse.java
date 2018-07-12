package setrep;
import java.util.*;
public class reverse {
	public static void main(String args[]){
		int a,i;
		String b="";
		System.out.println("Enter the Array Length");
		Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.println("Enter the array Numbers");
        int arr[]=new int[a];
        for( i=0;i<arr.length;i++){
        	arr[i]=in.nextInt();
        }
        for( i=arr.length-1;i>=0;i--){
        	b=b+arr[i];
        }  
        System.out.println(b);
	}
}

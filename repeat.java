package setrep;
import java.util.*;
public class repeat {
	public static void main(String args[]){
		int a,i,j;
		String b="";
		System.out.println("Enter the Array Length");
		Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.println("Enter the array Numbers");
        int arr[]=new int[a];
        for( i=0;i<arr.length;i++){
        	arr[i]=in.nextInt();
        }for( i=0;i<arr.length;i++){
        	b=b+arr[i];
        }
        for(i=0;i<b.length();i++){
        	for(j=i+1;j<b.length();j++){
        		if(b.charAt(i)==b.charAt(j)){
        			System.out.println(b.charAt(i));
        			b=b.replace(String.valueOf(b.charAt(i)),"");
        		}
        	}
        }
	}
}
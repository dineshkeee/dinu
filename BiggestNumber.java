package set1;
import java.util.*;
public class BiggestNumber {
		public static void main(String args[]){
			System.out.println("Enter the number");
			Scanner in=new Scanner(System.in);
			String a[]=in.nextLine().split(" ");
			int arr[]=new int[a.length];
		for(int i=0;i<a.length;i++){
				arr[i]=Integer.parseInt(String.valueOf(a[i]));
			}
		Arrays.sort(arr);
			System.out.println(arr[arr.length-1]);
		}	
}

package set1;
import java.util.*;
public class BiggestNumber {
		public static void main(String args[]){
			int a;
			System.out.println("Enter the length of Array");
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			int arr[]=new int[a];
			System.out.println("Enter the array elements");
			for(int i=0;i<a;i++){
				arr[i]=in.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[arr.length-1]);
		}
}

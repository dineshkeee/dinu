package ass;
import java.util.Scanner;
public class singleArray {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),l=0;
		String b=Integer.toString(a);
		int arr[]=new int[b.length()];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(String.valueOf(b.charAt(i)));
		}
		    l=arr.length;
		      while(l!=2){
				   for( int i=0;i<l-1;i++){
					arr[i]=Math.abs(arr[i]-arr[i+1]);
					}
				l--;
			}
		      int v=(Math.abs(arr[0]-arr[1]));
			   System.out.println(v);
		}	
	}



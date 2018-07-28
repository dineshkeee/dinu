package set1;
import java.util.*;
public class NaturalNum {
		public static void main(String args[]){
			int a,i,sum=0;
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			for(i=1;i<=a;i++){
				sum+=i;
			}System.out.println(sum);
		}
}

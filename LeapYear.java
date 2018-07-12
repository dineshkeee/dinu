package set1;
import java.util.*;
public class LeapYear {
		public static void main(String args[]){
			int year;
			System.out.println("enter the year");
			Scanner in=new Scanner(System.in);
			year=in.nextInt();
			if((year%400==0)&&(year%4==0)&&(year%100)==0){
				System.out.println("Leap Year");
			}
			else if((year%400==0)&&(year%4==0)||(year%100)!=0){
				System.out.println("Leap Year");	
			}	else{
				System.out.println("Not Leap Year");
			}
		}
}

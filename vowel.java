package set1;
import java.util.*;
public class vowel {
	public static void main(String args[]){
		System.out.println("Enter the character");
		Scanner in=new Scanner(System.in);
		String b=in.next().toLowerCase();
		if(b.charAt(0)>96&&b.charAt(0)<123){
		  if(b.equals("a")||b.equals("e")||b.equals("i")||b.equals("o")||b.equals("u")){
			System.out.println("Vowel");
		  }
		  else 
			System.out.println("Consonant");
		  }
		  else{
			System.out.println("Invalid");
		}
	}
}

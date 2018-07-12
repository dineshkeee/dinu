package set1;
import java.util.*;
public class vowel {
	public static void main(String args[]){
		String s1="a",s2="e",s3="i",s4="o",s5="u",b;
		System.out.println("Enter the character");
		Scanner in=new Scanner(System.in);
		b=in.next();
		if(b.equalsIgnoreCase(s1)||b.equalsIgnoreCase(s2)||b.equalsIgnoreCase(s3)||b.equalsIgnoreCase(s4)||b.equalsIgnoreCase(s5)){
			System.out.println("Vowel");
		}else if(b.equals("&")||b.equals("!")||b.equals("#")||b.equals("$")||b.equals("%")||b.equals("^")||b.equals("*")){
			System.out.println("Invalid");
		}
		else{
			System.out.println("Consonant");
		}
	}
}

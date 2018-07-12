package setrep;
import java.util.*;
public class Swap {
	public static void main(String args[]){
		String a,b="",c="",s1,s2;
		int  s,l;
		System.out.println("enter the String");
		Scanner in=new Scanner(System.in);
		a=in.next();
		l=a.length();
		if(l%2==0){
			s=l/2;
        b=a.substring(0,s);
        s1=new StringBuffer(b).reverse().toString();
        c=a.substring((l-s)+1,l);
       s2=new StringBuffer(c).reverse().toString();
       	}
		else{
			s=l/2+1;
	        b=a.substring(0,s);
	        s1=new StringBuffer(b).reverse().toString();
	        c=a.substring((l-s)+1,l);
	        s2=new StringBuffer(c).reverse().toString();
		}
		System.out.println(s1+s2);
}
}
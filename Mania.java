package dinesh;
import java.util.Scanner;
public class Mania {
 public static void main(String args[]){
	  int i=0,j,c=0,p=0,count=0;
	  String []s1=new String[100];
	  String s2="";
	  System.out.println("enter the String");
	 Scanner kd=new Scanner(System.in);
	 String s=kd.next();
	  int l=s.length();
	 System.out.println("the length of the string is "+l);
	  for( i=0;i<l;i++){
		  for(j=i+2;j<=l;j++){
			  s1[p]=s.substring(i,j);
			   c++;
			   System.out.print(s1[p]+" ");
			   s2=s2+s1[p];
			   p++;
		  }	  
	  }
      System.out.println("\n"+s2);
	  System.out.println("enter the check string:");
	  String check=kd.next();
	for(int k=0,y=0;k<s2.length();k++,y++){
		if(check.equals(s2.substring(y, y+1))){
			count++;
		}
	  }System.out.print(count);
	  	}  
}	  

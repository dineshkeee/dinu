package dinesh;
import java.util.Scanner;
public class Password {
      public static void main(String args[]) {
    	  String  name,email,phno,e,s1="",s2="",s3="",s4="",s5="",s6="",output="";
    	  int l,l1,l3,l4,i,sum=0,b,total=0,c=0,k=0;
    	  char a;
    	  Scanner in=new Scanner(System.in);
    	  name=in.next();
    	  phno=in.next();
    	  email=in.next();
    	  l=name.length();
    	  l1=phno.length();
    	  l4=email.length();
      if(l4>3){
    	  s1=name.substring(2,3);
    	  s2=name.substring(l-3,l-2);
    	  s3=phno.substring(l1-4,l1-3);
    	  s5=name.substring(0,1);
    	  e=email.replaceAll("[^0-9]","");
    	  l3=e.length();
    	  if(l3>0){
    	  for(i=0;i<l3;i++){
    		  c=Integer.parseInt(String.valueOf(e.charAt(i)));
    			  sum=sum+c;
    	  }
    	 while(sum!=0){
    			  b=sum%10;
    			  sum/=10;
    			  total=total+b;
    			  s4=Integer.toString(total);
    		  }
    	  }else{
    	   s4=email.substring(l4-11,l4-10);
    	   k=s4.charAt(0);
    	   while(k!=0){
    		   b=k%10;
 			  k/=10;
 			  total=total+b;
 			  if(total>9&& k==0){
 				  k=total;
 				  total=0;
 			  }
 			  s4=Integer.toString(total);  
    	   }} //System.out.println(s4);
    	   switch(s4){
    	   case "1":
    		   s4="!";
    		   break;
    	   case "2":
    		   s4="@";
    		   break;
    	   case "3":
    		   s4="#";
    		   break;
    	   case "4":
    		   s4="$";
    		   break;
    	   case "5":
    		   s4="%";
    		   break;
    	   case "6":
    		   s4="^";
    		   break;
    	   case "7":
    		   s4="&";
    		   break;
    	   case "8":
    		   s4="*";
    		   break;
    	   case "9":
    		   s4="(";
    		   break;
    	   }
    	   
          }
      output=s1+s2+s3+s4+s5;
       System.out.println(output);
      
    }
 }
    
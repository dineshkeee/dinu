package dinesh;
import java.util.Scanner;
public class Encription {
	 public static void main(String args[]) {
	    	int l,t,t1,t2,i=0;
	    	char b,c,d=0;
	    	String a,s;
	    	System.out.println("Enter the string");
	    	Scanner kd=new Scanner(System.in);
	    	a=kd.next();
	    	s=a.substring((l=(a.length()))-1,l);
	    	System.out.println(s);
	    	b=s.charAt(0);
	    	if(b>=65&&b<=90){
	    		t=b-64;
	    	}else {
	    		t=b-96;
	    	}
	               for( i=0;i<l;i++){
	            	   c=a.charAt(i);
	            	   if(c>=65&&c<=90 &&(i!=l-1)){
	            		  t1=c-64;
	            		 t2=t1-t; 
	            		if(t2>0) {
	            			d=(char)(t2+64);
	            			System.out.print(d);
	            		}
	            			else if(t2==0){
	            				d=(char)(t2+26+64);
	            				System.out.print(d);
	            			}
	            		else{
	            			d=(char)(t2+64+26);
	            			System.out.print(d);
	            		}}
	 	            	   if(c>=97&&c<=122 &&(i!=l-1)){
	 	            		  t1=c-96;
	 	            		 t2=t1-t;
	 	            		if(t2>0) {
	 	            			d=(char)(t2+96);
	 	            			System.out.print(d);
	 	            		}
	 	            		else if(t2==0){
	            				d=(char)(t2+26+96);
                             System.out.print(d);	            	
	 	            		}else{
	 	            		d=(char) (t2+96+26);
	 	            			System.out.print(d);
	 	            		}  
	            	   }
	            }
	               System.out.println(s);
	   }
	 }

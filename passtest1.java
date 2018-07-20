package dinesh;
import java.util.Scanner;
public class passtest1 {
	  public static void main(String args[]){
		  int rn,a,sum=0;
		  String name,l;
		  System.out.println("enter the name");
		  Scanner kd=new Scanner(System.in);
	      name=kd.nextLine();
		 System.out.println("enter the room number");  
		  rn=kd.nextInt();
		      int temp=rn;
	      char r[]=new char[5];
	      while(rn!=0){
	    	  a=rn%10;
	    	  rn/=10;
	    	  sum=sum+a;
	    	   if(rn==0&&sum>=10){
	    		  rn=sum;
	    	  sum=0;}
	    	  r[0]=Character.forDigit(sum,10);
	    	  }
	      int t=temp;
	         int n=temp%10;    
	      switch(n){
	      case 1:
	    	  r[1]='!';
	    	  break;
	      case 2:
	    	  r[1]='@';
	    	  break;
	      case 3:
	    	  r[1]='#';
	    	  break;
	      case 4:
	    	  r[1]='$';
	    	  break;
	      case 5:
	    	  r[1]='%';
	    	  break;
	      case 6:
	    	  r[1]='^';
	    	  break;
	      case 7:
	    	  r[1]='&';
	    	  break;
	      case 8:
	    	  r[1]='*';
	    	  break;
	      case 9:
	    	  r[1]='(';
	    	  break;
	      case 0:
	    	  r[1]=')';
	    	  break;
	      default:
	      }
	      int s=name.length();
	      l=name.substring((s-1),s);
	      r[2]=l.charAt(0);
	      int m=t/10;
	       m=m%10;
	      r[3]=Character.forDigit(m,10);
	      String d=new String(r);
	      System.out.println(d);
	      }
	  }




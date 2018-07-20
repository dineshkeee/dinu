package ass;
import java.util.Scanner;
public class milestone {
	 public static void main(String args[]){
		 Scanner in=new Scanner(System.in);
		 String arr[]=in.nextLine().split(" ");
		 int l=in.nextInt();
		 int x,y;
		 String m,n,o,p,r="",t="",f="",g="";
		 if(l>=11&&l<=99&&l%10!=0){
			 int e=(l%10)-1;
			 int s=(l/10)-1;
			 int l1=arr[e].length();
			 int l2=arr[s].length();
			 if(l1%2==0){
				 x=l1/2;
				 m=arr[e].substring(0,x);
				 n=arr[e].substring(x,l1);
			}
			 else {
				 x=(l1/2)+1;
				 m=arr[e].substring(0,x);
				 n=arr[e].substring(x-1, l1);
			 
		      }
			if(l2%2==0){
				 y=(l2/2);
				 o=arr[s].substring(0,y);
				 p=arr[s].substring(y,l2);
			 }
			 else{
				 y=(l2/2)+1;
				 o=arr[s].substring(0,y);
				 p=arr[s].substring(y-1,l2);	 
			 }
			 StringBuffer z=new StringBuffer(m);
		           r=((z.reverse()).toString());
		     StringBuffer v=new StringBuffer(o);
		           t=((v.reverse()).toString());
		 	      f=n+r;
			      g=p+t;
			     String h=g+" "+f;
                  System.out.println(h);
            }
		 }
       }
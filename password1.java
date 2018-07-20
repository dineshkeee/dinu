package dinesh;
import java.util.Scanner;
public class password1 {
	      public static void main(String args[]) {
	    	  String a,b,c,d,temp,h,k,cap,small;
	    	  int l,e,f,s,c1,s1,z,cons=0;
	    	  int count=0;
	    	  char i,n;
	    	  System.out.println("Enter the password to check");
	    	  Scanner kd=new Scanner(System.in);
	    	  a=kd.next();
	    	  temp=a;
	    	  l=a.length();
	    	  b=a.replaceAll("[^0-9]","");
	    	  c=a.replaceAll("[^A-Z,a-z]","");
	    	  cap=a.replaceAll("[^A-Z]","");
	    	  small=a.replaceAll("[^a-z]","");
	    	  d=a.replaceAll("[^!@#$%^&*()]","");
	    	  f=c.length();
	    	  String ch[]=new String[f];
	    	  e=b.length();
	    	  s=d.length();
	    	  c1=cap.length();
	    	  s1=small.length();
	    	  h=temp.substring(0,1);
				i=h.charAt(0);
				k=temp.substring(l-1,l);
				n=k.charAt(0);	
				for(int j=0,m=0;j<f;j++,m++){
  	    		  ch[j]=c.substring(m,m+1);
  	    		  }
				for(int x=0;x<f-2;x++)
				{
					z=x+1;					
					for(int v=0;v<2;v++){
						if(ch[x].equals(ch[z])){
							count++;
							z++;
						}
					}
					cons=0;
					if(count==3){
						cons++;
					}else{
						cons=cons+2;
					}
				}
				int y=cons;
				if((y==2)&&(l>=8&&l<=28)&&(2<=e &&f>=3&&s>=1&&c1>=1&&s1>=2)&&(i>=65&&i<=90||i>=97&&i<=122)&&(n==33||n>=35&&n<=38||n>=40&&n<=42||n==64||n==94)) {
	                               System.out.println("valid"); 		
	    							    					}
	                    else{
	    	    		  System.out.println("invalid");
	    		  }
	    	    	  
	    	  }
	    	  }




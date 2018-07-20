package dinesh;
import java.util.Scanner;
public class John {
 public static void main(String args[]){
	 int l[]=new int[20],sp;
	 String a[]=new String[50];
	 String f[]=new String[50];
	 String m[]=new String[50];
	 String e[]=new String[50];
	 System.out.println("enter the names to split");
	 Scanner kd=new Scanner(System.in);
	 a[0]=kd.next();
	 a[1]=kd.next();
	 a[2]=kd.next();
	 l[0]=a[0].length();
	 l[1]=a[1].length();
	 l[2]=a[2].length(); 
	 for(int i=0;i<3;i++){
	 if(l[i]%3==0){
		 sp=l[i]/3;
		 f[i]=a[i].substring(0,sp);
		 m[i]=a[i].substring(sp,l[i]-sp);
		 e[i]=a[i].substring(l[i]-sp, l[i]);
		 System.out.println(f[i]+" "+m[i]+" "+e[i]);
	 }
	 else if(l[i]%3==1){
		 sp=l[i]/3;
		 f[i]=a[i].substring(0,sp);
		 m[i]=a[i].substring(sp,l[i]-sp);
		 e[i]=a[i].substring(l[i]-sp, l[i]);
		 System.out.println(f[i]+" "+m[i]+" "+e[i]);	 
	 }
	 else{
		 sp=l[i]/3;
		 sp=sp+1;
		 f[i]=a[i].substring(0,sp);
		 m[i]=a[i].substring(sp,l[i]-sp);
		 e[i]=a[i].substring(l[i]-sp,l[i]);
		 System.out.println(f[i]+" "+m[i]+" "+e[i]);
	 }
 }System.out.println("output 1="+f[0]+m[1]+e[2]+"\noutput 2="+m[0]+e[1]+f[2]+"\noutput 3="+e[0]+f[1]+m[2]);
kd.close();
}
}
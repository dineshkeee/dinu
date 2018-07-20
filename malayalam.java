package dinesh;
import java.util.Scanner;
public class malayalam {
	public static void main(String arg[]){
		String s;int i=0,j,c=1;
		System.out.println("Enter the String");
		Scanner kd=new Scanner(System.in);
		s=kd.next();
		char a[]=new char[100];
		for(i=0;i<s.length();i++){
			a=s.toCharArray();
			if(a[i]!=' '){
				for(j=i+1,c=1;j<s.length();j++){
					if(a[i]==a[j])
						c++;
				}
				if(c>1){
					s=s.replace(String.valueOf(a[i]),"");
					System.out.println(a[i]+"="+c);
					i--;
				}
				else
					System.out.println(a[i]+"="+c);
			}
		}
		}
		}

package dinesh;
import java.util.*;
import java.util.Scanner;
public class FIXER {
	 public static void main(String args[]){
		 String  a=args[0];
		 String b[]=args[1].split(":");
		 String s[]=new String[10];
		 int l2=a.length();
		 int x=b.length;
		 int p=0;
		 for(String w:b){
			 int l1=w.length();
			 if(l1==l2){
				 if((a.substring(0,2)).equalsIgnoreCase(w.substring(0,2))&&(a.substring(l2-2,l2).equalsIgnoreCase(w.substring(l1-2,l1)))){
					 s[p]=w.toUpperCase();
					 p++;					 
				 }
		 }
	 }if(p!=0){
		 for(int i=0;i<p-1;i++){
			 System.out.print(s[i]+":");
		 }
		 System.out.print(s[p-1]);
	 }else
	 System.out.println("ERROR");
}}

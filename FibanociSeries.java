package week1.day2;

public class FibanociSeries {

	public static void main(String[] args) {
		 int n1=0,n2=1;
		int n3,range=8; 
		 System.out.print(n1+" "+n2);    
		    
		 for(int i=3;i<=range;i++)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		}}  

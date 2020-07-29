package week3Day;

public class CalculatorOverloading {
	public void add(int x,int y) {
System.out.println(x+y);
	}
	public void add(int x,int y,int z) {
System.out.println(x+y+z);
	}
	public void multiply(int x,int y) {
System.out.println(x*y);
	}
	public void multiply(int x,double y) {
System.out.println(x*y);
	}
	public void subtract(int x,int y) {
System.out.println(x-y);
	}
	public void subtract(double x,double y) {
		System.out.println(x-y);
			}	
	public void divide(int x,int y) {
	System.out.println(x/y);
	}
	public void divide(double x,int y){
	System.out.println(x/y);
	}
	public static void main(String[] args) {
		CalculatorOverloading co = new CalculatorOverloading();
co.add(5,5);
co.add(5,5,4);
co.multiply(5, 5);
co.multiply(5,55.5);
co.subtract(9,5);
co.subtract(45.67,25.52);
co.divide(10,2);
co.divide(55.5, 5);
	}

}

package week1.day2;

import java.util.Arrays;

public class SeondLargest {

	public static void main(String[] args) {
	int[] sl= {3,2,11,4,6,7};
	Arrays.sort(sl);
	System.out.println("ascensing order");
for(int i=0;i<=sl.length-1;i++) {
System.out.println( +sl[i]);
}
	
System.out.println("second largest number is " +sl[sl.length-2]);	
	}

}
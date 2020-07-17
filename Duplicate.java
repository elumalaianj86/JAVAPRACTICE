package week1.day2;

public class Duplicate {

	public static void main(String[] args) {
		int[] dup= {14,12,13,11,15,14,18,16,17,17,18,17,20};
		int count;
		System.out.println("duplicate elements in array");
		for(int i=0;i<dup.length-1;i++) {
			count=0;
			for (int j=i+1;j<=dup.length-1;j++) {
				if(dup[i]==dup[j]) {
					
				count++;
					
				}
				
				}
			if(count>0) {
				System.out.println(dup[i]);
				}
		
			}
		}
		
	}

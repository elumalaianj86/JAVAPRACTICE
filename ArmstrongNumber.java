package week1.day2;
public class ArmstrongNumber {
	   public static void main(String[] args) {
	        int num = 153;
	        int arm = 0;
	        int rem;
	        int input=num;
	        while (input>0)
	        {
	        rem=input%10;
	        arm=arm+(rem*rem*rem);
	        input=input/10;
	        }
	    if(num==arm) {
	    	System.out.println(num+ " is armstrong  number");
	    }
	    else {
	    	System.out.println(num+ "is not armstrong number");
	    }
	   }
}
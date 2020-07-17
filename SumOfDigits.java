package classroom1;

public class SumOfDigits {
public static void main(String[] args) {
	int n=888;
	int sum=0;
	int r;
while(n>0) {
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println(sum);
}

}
	 
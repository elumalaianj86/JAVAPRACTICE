package weekday1;
import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
	int[] me= {1,2,3,4,7,6,8};
Arrays.sort(me);
	for(int i=1;i<=me.length;i++) {
		if (i != me[i-1]) {
			System.out.println("missing element"+" "  +i);
			break;	
	}
	}
	}
}


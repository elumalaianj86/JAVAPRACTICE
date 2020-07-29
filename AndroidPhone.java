package week3Day;

public class AndroidPhone extends Mobile {
	public void takeVideo() {
System.out.println("video took");
}
	public static void main(String[] args) {
		AndroidPhone android = new AndroidPhone();
		android.takeVideo();
		android.sendMsg();
		android.makeCall();
		android.saveContact();
		
	}
}

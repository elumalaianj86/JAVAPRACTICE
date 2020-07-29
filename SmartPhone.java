package week3Day;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsapp() {
System.out.println("whatsapp connected");
}
public static void main(String[] args) {
	SmartPhone sp=new SmartPhone();
	sp.connectWhatsapp();
	sp.takeVideo();
	sp.sendMsg();
	sp.makeCall();
	sp.saveContact();
}

}



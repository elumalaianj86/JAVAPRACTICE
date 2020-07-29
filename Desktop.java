package week3Day;

public class Desktop implements HardWare,SoftWare{
	public  void desktopModel() {
System.out.println("This is desktop model");
	}

	public void hardwareResources() {
	
	System.out.println("hardware resource installed");	
	}
	public void softwareResources() {
System.out.println("software resource installed");
			}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();
				
	}
}

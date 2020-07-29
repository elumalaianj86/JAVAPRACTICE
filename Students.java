package bank;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("student id is" +" "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student id and student name" +" " +id+"&"+name);		
	}
		public void getStudentInfo(String email,long PhoneNum) {
			System.out.println("Student email is"+" "+email);
			System.out.println("Student phone num is"+" "+PhoneNum);
		}
public static void main(String[] args) {
	Students std =new Students();
	std.getStudentInfo(3890);
	std.getStudentInfo(3890, "Elumalai m s");
std.getStudentInfo("elumalaianj86@gmail.com",8610432003l);
}
}



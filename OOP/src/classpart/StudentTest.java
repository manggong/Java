package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student("jihwan");
		// studentKim.studentName = "jihwan";
		studentKim.address = "이천";
		
		studentKim.showStudentInfo();
		
		Student studentYang = new Student(100, "sohyun");
		// studentYang.studentName = "sohyun";
		studentYang.address = "서울";
		
		studentYang.showStudentInfo();
	}
}

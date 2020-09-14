package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student(100, "kim");
		
		studentKim.addSubject("korean", 100);
		studentKim.addSubject("math", 90);
		
		Student studentLee = new Student(101, "lee");
		
		studentLee.addSubject("korean", 70);
		studentLee.addSubject("math", 80);
		
		
		studentKim.showStudentInfo();
		System.out.println("---------------------");
		studentLee.showStudentInfo();

	}

}

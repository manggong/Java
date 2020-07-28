package classpart;

public class PersonTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 26;
		person.name = "james";
		person.married = true;
		person.child = 3;
		
		person.showPersonInfo();
	}
	
}

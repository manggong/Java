package cooperation;

public class TakeTransTest {
	
	public static void main(String[] args) {
		Student studentK = new Student("Kim", 5000);
		Student studentY = new Student("Yang", 10000);
		
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(1);
		
		studentK.takeBus(bus1);
		studentY.takeSubway(subwayGreen);
		
		studentK.showInfo();
		studentY.showInfo();
		
		bus1.showBusInfo();
		bus2.showBusInfo();
		
		subwayGreen.showSubwayInfo();
	}

}

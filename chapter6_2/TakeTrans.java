package chapter6_2;



public class TakeTrans {

	public static void main(String[] args) {
		Student park = new Student("박지호", 99999900);
		Bus b = new Bus("43다 1317");
		Subway s = new Subway("1호선");
		Bus b2 = new Bus("14나 7777");
		Subway s2 = new Subway("2호선");
		
		
		park.showInfo();
		
		park.takeBus(b);
		b.showInfo();
		park.showInfo();
		
		park.getOffBus(b);
		b.showInfo();
		
		
		park.takeSubway(s2);
		s2.showInfo();
		park.showInfo();
		
		park.getOffSubway(s2);
		s2.showInfo();
		park.showInfo();
		park.setMoney(20000);
		park.showInfo();
	
		

	}

}

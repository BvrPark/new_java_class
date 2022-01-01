package chapters11;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory cf1 = CarFactory.getInstance();				//cf1 <= instance
		CarFactory cf2 = CarFactory.getInstance();
		CarFactory cf3 = CarFactory.getInstance();
		CarFactory cf4 = CarFactory.getInstance();
		
		Car c1 = cf1.createCar();								//c1 <= selfNumber++
		Car c2 = cf2.createCar();
		Car c3 = cf3.createCar();
		Car c4 = cf4.createCar();
		
		c1.carInfo();				//carInfo->carNumber?
		c2.carInfo();
		c3.carInfo();
		c4.carInfo();
	}

}

package chapter7;

/**
 * 
 * 상속을 시켜줄때 상속을 해줄 클래스에게만 허락되는 예약어 = protected
 *
 */

public class Customer{
	private int customerID;			//회원번호
	private String customerName;	//회원이름
	private String customerGrade;	//회원등급
	private int bonusPoint;			//보너스 포인트
	private double bonusRatio;		//적립 비율
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int id, String name) {
		customerID = id;
		customerName = name;
		initCustomer();
		
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	
}

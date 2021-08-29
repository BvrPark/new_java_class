package chapter7;

/**
 * 
 * ����� �����ٶ� ����� ���� Ŭ�������Ը� ����Ǵ� ����� = protected
 *
 */

public class Customer{
	private int customerID;			//ȸ����ȣ
	private String customerName;	//ȸ���̸�
	private String customerGrade;	//ȸ�����
	private int bonusPoint;			//���ʽ� ����Ʈ
	private double bonusRatio;		//���� ����
	
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
		return customerName + "���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	
}

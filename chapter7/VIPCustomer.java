package chapter7;

public class VIPCustomer extends Customer {

	private int agentID; 			// VIP�� �������ִ� ��� ����� ���̵�
	private double saleRatio; 		// VIP���� ������

	public VIPCustomer(int id, String name, int agentID) {
		super(id,name);						//Customer(String name);
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05);			// �ش簡���� 5%�� ����
		saleRatio = 0.1;			// �ش簡���� 10% ����
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		super.setBonusPoint(super.getBonusPoint() + (int)(price*super.getBonusRatio()));
		return price - (int)(price*saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	 @Override
	public String showCustomerInfo() {
		 return super.getCustomerName() + "���� ����� " + super.getCustomerGrade() + "�̸�, ���ʽ� ����Ʈ�� " + super.getBonusPoint() + "�Դϴ�. �����մϴ�.";
	}
}

package chapters10_2;

public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
	@Override
	public int hashCode() {						//hashSet���� ���
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {			//hashSet���� ���
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(this.memberId == m.memberId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Member m) {			//treeSet���� ���
		return this.memberId - m.memberId;
	}
	
	
	
	
	
	
}
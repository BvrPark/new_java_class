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
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public int hashCode() {						//hashSet에서 사용
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {			//hashSet에서 사용
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
	public int compareTo(Member m) {			//treeSet에서 사용
		return this.memberId - m.memberId;
	}
	
	
	
	
	
	
}

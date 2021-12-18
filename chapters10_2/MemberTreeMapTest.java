package chapters10_2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member(1005,"김준일"));
		tm.addMember(new Member(1008,"김준일"));
		tm.addMember(new Member(1002,"김준일"));
		tm.addMember(new Member(1004,"김준일"));
		tm.addMember(new Member(1001,"김준일"));
		tm.addMember(new Member(1001,"박지호"));		//key값이 동일할 경우 제일 마지막에 들어온 값이 덮어버림
		
		tm.showAllMember();
		
	}

}

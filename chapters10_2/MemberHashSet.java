package chapters10_2;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member m) {
		hashSet.add(m);
	}
	
	public boolean removeMemver(int memberId) {
		Iterator<Member> ir = hashSet.iterator();		//ir에 들어있는 Member객체들을 정리한다./ Iterator => BOF,EOF를 만들어줌
		
		while(ir.hasNext()) {			//hasNext() => 가르키는 다음 곳에 값이 있으면 수행
			Member m = ir.next();
			if(m.getMemberId() == memberId) {
				hashSet.remove(m);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for(Member m : hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
}

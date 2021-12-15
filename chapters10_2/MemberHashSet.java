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
		Iterator<Member> ir = hashSet.iterator();		//ir�� ����ִ� Member��ü���� �����Ѵ�./ Iterator => BOF,EOF�� �������
		
		while(ir.hasNext()) {			//hasNext() => ����Ű�� ���� ���� ���� ������ ����
			Member m = ir.next();
			if(m.getMemberId() == memberId) {
				hashSet.remove(m);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	public void showAllMember() {
		for(Member m : hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
}
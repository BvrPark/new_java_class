package chapters10_2;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	
	
	public void addMember(Member m) {
		arrayList.add(m);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i< arrayList.size();i++) {
			Member m = arrayList.get(i);
			if(m.getMemberId() == memberId) {
				arrayList.remove(i);				//ArrayList�� �� �����ϱ� remove(index) = ��ȯ���� ��ü ->���⼱ arrayList.remove(i)�� ��ȯ���� m
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public boolean modifyMember(int memberId, String memberName) {
		for(int i = 0; i<arrayList.size(); i++) {
			Member m = arrayList.get(i);
			if(m.getMemberId() == memberId) {
				m.setMemberName(memberName);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		/*
		for(int i = 0; i<arrayList.size();i++) {
			Member m = arrayList.get(i);			//ArrayList�� �� �������� get(index)
			System.out.println(m);
		}
		*/
		for(Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println();
		
	}
	

}

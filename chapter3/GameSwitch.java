package chapter3;

public class GameSwitch {
	

	public static void main(String[] args) {
		int round = 1;
		boolean dead = false;

		switch (round) {
		case 1:
			System.out.println("게임 시작");
			if(dead ==true) {
				System.out.println(round + "를 클리어하지 못하였습니다.");
				System.out.println("처음붙 다시 시작합니다.");
				break;
			}
			else {
				System.out.println(round + "라운드를 클리어 하였습니다.\n");
				round++;
			}
		case 2:
			System.out.println(round + "round 시작");
			if(dead ==true) {
				System.out.println(round + "를 클리어하지 못하였습니다.");
				System.out.println("처음붙 다시 시작합니다.");
				break;
			}
			else {
				System.out.println(round + "라운드를 클리어 하였습니다.\n");
				round++;
			}
			
		case 3:
			System.out.println(round + "round 시작");
			if(dead ==true) {
				System.out.println(round + "를 클리어하지 못하였습니다.");
				System.out.println("처음붙 다시 시작합니다.");
				break;
			}
			else {
				System.out.println(round + "라운드를 클리어 하였습니다.\n");
				round++;
			}
			
		case 4:
			System.out.println(round + "round 시작");
			if(dead ==true) {
				System.out.println(round + "를 클리어하지 못하였습니다.");
				System.out.println("처음붙 다시 시작합니다.");
				break;
			}
			else {
				System.out.println(round + "라운드를 클리어 하였습니다.\n");
				round++;
			}
			
		case 5:
			System.out.println(round + "round 시작");
			if(dead ==true) {
				System.out.println(round + "를 클리어하지 못하였습니다.");
				System.out.println("처음붙 다시 시작합니다.");
				break;
			}
			else {
				System.out.println("게임 클리어");
				break;
			}
			
		default:
			System.out.println("캐릭터의 라운드가 잘못 저장되었습니다.");
			round = 1;

		}

	}

}

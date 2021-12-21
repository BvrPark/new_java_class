package chapters10_2;

import java.util.ArrayList;

class Queue{
	private ArrayList<String> q = new ArrayList<String>();
	public void enqueue(String data) {
		q.add(data);
	}
	public String dequeue() {
		if(q.size()==0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}else {
		return q.remove(0);
		}
	}
}
public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		
		
		
	}

}

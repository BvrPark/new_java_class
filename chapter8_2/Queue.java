package chapter8_2;

/**
 * 
 * Queue(큐)
 * FIFO(first in first out)
 * 제일 먼저 들어간 것이 가장 먼저 나온다.
 * 데이터의 삽입 : enQueue
 * 데이터의 삭제(내보내기) : deQueue ->데이터 값을 내보내고 난후 그 값을 삭제 
 *
 */

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getQueueSize();
}

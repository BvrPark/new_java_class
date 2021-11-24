package chapters10_2;

import java.util.Collection;
import java.util.Iterator;


/**
 *
 * List(interface) <- Collection(i)
 * - ArrayList(Generic)
 * - LinkedList(Generic)
 * 특징 : index기준으로 동작
 * 
 * Set(interface) <- Collection(i) =>set은 중복을 허용하지 않는다(value를 기준으로 동작하기 때문에)
 * - Hashset(Generic)	=> 처음부터 끝까지 데이터 탐색 후 조회
 * - TreeSet(Generic)	=> 현재의 값을 기준으로 데이터의 값을 탐색 후 조회
 * 특징 : value값 기준으로 동작(들어있는 값을 기준으로 동작) -> index가 없음
 * 
 * Map(interface)
 * - HashMap(Generic)
 * - TreeMap(Generic)
 * 특징 : key값과 value값이 쌍으로 이루어진 상태에서 동작 ->index대신 key값이라는 임의의 index역할을 하는 값을 만들어 value값과 매칭을 시킨다. -> set방식으로 찾으나 index를 임의로 만든다.
 * 값추가 : put
 * 값제거 : remove
 * 키값 반환 : keySet
 */

public abstract class CollectionEx<E> implements Collection<E>{
	@Override
	public boolean add(E e) {	//Collection에 객체를 추가
		return false;
	}
	
	@Override
	public void clear() {		//모든 객체를 제거.
		
	}
	
	@Override
	public Iterator<E> iterator(){	//순환할 반복(Iterator)을 반환.
		return null;
	}
	
	@Override
	public boolean remove(Object o) {	//매개변수에 해당하는 인스턴스가 존재하면 제거
		return false;
	}
	
	@Override
	public int size() {				//요소의 갯수를 반환
		return 0;
	}

}


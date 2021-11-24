package chapters10_2;

import java.util.Collection;
import java.util.Iterator;


/**
 *
 * List(interface) <- Collection(i)
 * - ArrayList(Generic)
 * - LinkedList(Generic)
 * Ư¡ : index�������� ����
 * 
 * Set(interface) <- Collection(i) =>set�� �ߺ��� ������� �ʴ´�(value�� �������� �����ϱ� ������)
 * - Hashset(Generic)	=> ó������ ������ ������ Ž�� �� ��ȸ
 * - TreeSet(Generic)	=> ������ ���� �������� �������� ���� Ž�� �� ��ȸ
 * Ư¡ : value�� �������� ����(����ִ� ���� �������� ����) -> index�� ����
 * 
 * Map(interface)
 * - HashMap(Generic)
 * - TreeMap(Generic)
 * Ư¡ : key���� value���� ������ �̷���� ���¿��� ���� ->index��� key���̶�� ������ index������ �ϴ� ���� ����� value���� ��Ī�� ��Ų��. -> set������� ã���� index�� ���Ƿ� �����.
 * ���߰� : put
 * ������ : remove
 * Ű�� ��ȯ : keySet
 */

public abstract class CollectionEx<E> implements Collection<E>{
	@Override
	public boolean add(E e) {	//Collection�� ��ü�� �߰�
		return false;
	}
	
	@Override
	public void clear() {		//��� ��ü�� ����.
		
	}
	
	@Override
	public Iterator<E> iterator(){	//��ȯ�� �ݺ�(Iterator)�� ��ȯ.
		return null;
	}
	
	@Override
	public boolean remove(Object o) {	//�Ű������� �ش��ϴ� �ν��Ͻ��� �����ϸ� ����
		return false;
	}
	
	@Override
	public int size() {				//����� ������ ��ȯ
		return 0;
	}

}


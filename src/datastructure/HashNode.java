package datastructure;

public class HashNode <K,V>{
	
	private V value;
	private K key;
	private HashNode<K,V>prev;
	private HashNode<K,V>next;
	
	public HashNode(V value, K key) {
		this.value = value;
		this.key = key;
		prev = null;
		next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public HashNode<K, V> getPrev() {
		return prev;
	}

	public void setPrev(HashNode<K, V> prev) {
		this.prev = prev;
	}

	public HashNode<K, V> getNext() {
		return next;
	}

	public void setNext(HashNode<K, V> next) {
		this.next = next;
	}
	
	@Override
	public int hashCode() {
		if(key==null) {
			return 0;
		}else {
			return key.hashCode();
		}
	}

}

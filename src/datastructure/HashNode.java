package datastructure;

public class HashNode <K,V>{
	
	private V value;
	private K key;
	private HashNode<K,V>previous;
	private HashNode<K,V>next;
	
	public HashNode(V value, K key) {
		this.value = value;
		this.key = key;
		previous = null;
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

	public HashNode<K, V> getPrevious() {
		return previous;
	}

	public void setPrevious(HashNode<K, V> prev) {
		this.previous = prev;
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

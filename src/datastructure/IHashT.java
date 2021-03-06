package datastructure;

public interface IHashT <K,V> {
	
	public int hashFunction(int htCode);
	
	public void add(K key, V value); 
	
	public boolean remove(K key);
	
	public V get(K key);
	
	public int count();
	
}

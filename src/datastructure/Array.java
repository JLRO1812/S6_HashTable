package datastructure;

public class Array <K,V>{
	
	private final HashNode<K,V>[] array;
	private final int length;
	
	private int counter;
	
	@SuppressWarnings("rawtypes")
	public Array(Class<HashNode>class1,int length) {
		@SuppressWarnings("unchecked")
		HashNode<K,V>[]newInstance=(HashNode<K,V>[])java.lang.reflect.Array.newInstance(class1,length);
		this.array=newInstance;
		counter=0;
		this.length=length;
	}
	
	public void set(int i,HashNode<K,V>n) {
		array[i]=n;
		counter++;
	}
	
	public boolean delete(int i, K key) {
		///Pendiente
		return false;
	}
	
	public HashNode<K,V>get(int i){
		return array[i];
	}
	
	public  int getCounter() {
		return counter;
	}
	
	public int getLength() {
		return length;
	}

}

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
		boolean check = false;
		
		if(array[i]!=null) {
			HashNode<K,V> aux = array[i];
			
			if(aux.getKey().equals(key)) {
				if(aux.getNext()!=null) {
					array[i]=array[i].getNext();
					aux.getNext().setPrevious(null);
					counter--;
				}else {
					array[i]=null;
					counter--;
					return true;
				}
			}else {
				while(aux.getNext()!=null&&!check) {
					if(aux.getKey().equals(key)) {
						check=true;
					}else {
						check=false;
					}aux=aux.getNext();
				}
				
				if(check==true) {
					if(aux.getNext()!=null) {
						aux.getPrevious().setNext(aux.getNext());
						aux.getNext().setPrevious(aux.getPrevious());
						counter--;
					}else {
						aux.getPrevious().setNext(null);
						counter--;					
					}
				}
			}
		}return check;
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

package datastructure;

public class HashT <K,V> implements IHashT<K,V> {
	
	private Array<K,V>array;
	public int length;
	
	public HashT(int length) {
		array=new Array<K,V>(HashNode.class,length);
		this.length=length;
	}

	@Override
	public int hashFunction(int htCode) {
		// TODO Auto-generated method stub
		int code=htCode%length;
		
		if(code<0)
			code=code*(-1);
		return code;
	}

	@Override
	public void add(K key, V value) {
		// TODO Auto-generated method stub
		int function=hashFunction(key.hashCode());
		
		HashNode<K,V>node=new HashNode<K,V>(value,key);
		if(array.get(function)!=null) {
			HashNode<K,V> aux=array.get(function);
			aux.setPrevious(node);
		}else {
			array.set(function, node);
		}
		
	}

	@Override
	public boolean remove(K key) {
		// TODO Auto-generated method stub
		int function=hashFunction(key.hashCode());
		
		return array.delete(function, key);
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		int function=hashFunction(key.hashCode());
		
		if(array.get(function)!=null) {
			HashNode<K,V>aux=array.get(function);
			
			if(aux.getKey().equals(key)) {
				return aux.getValue();
			}else {
				while(aux.getNext()!=null) {
					
					if(aux.getKey().equals(key)) {
						return aux.getValue();
					}else {
						aux=aux.getNext();
					}
				}
			}
		}
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return array.getCounter();
	}

}

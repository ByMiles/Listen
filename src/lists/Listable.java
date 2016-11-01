package lists;

public interface Listable<T> 
{
	public void add(T data);
	public int insertAt(int index, T data);
	public void delete(int index);
	
	public boolean isEmpty();
	public void clear();
	public int getSize();
	public void printAll();
	
	public T get(int index);
	
	// TODO: sort
	// TODO: search
}

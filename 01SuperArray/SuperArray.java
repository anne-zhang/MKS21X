
public class SuperArray{
    private int size;
    private String[] data;

    public SuperArray(){
    this.data = data;
    this.size = size;
	data = new String[10];
	size = 0;
    }

    public void clear(){
	data = new String[10];
	size = 0;
    }

    public int size(){
	return size;
    }

    public boolean isEmpty(){
	return size == 0;
    }

    public boolean add(String element){
	newsize();
	data[size] = element;
	size++;
	return true;
    }

}
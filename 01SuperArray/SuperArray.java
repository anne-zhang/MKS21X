
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
    private void newsize(){
	    String[] newData = new String [size * 2 + 1];
	    for(int i = 0; i < size; i++){
		newData[i] = data[i];
	    }
	    data = newData;
	}
	
	 public String set(int i, String element){
	if(i < 0 || i >= size){
	    System.out.println("Error: Index out of bounds");
	    return "";
	}
	String old = data[i];
	data[i] = element;
	return old;
    }
    
    public String get(int i){
	if(i >= size || i < 0){
	    System.out.println("Error: Index out of bounds");
	    return "";
	}
	return data[i];
    }
    
 	public void add(int index, String element){  
        if (index < 0 || index >= size()){
            System.out.println("Error: Index out of bounds");
        }else {
            newsize();
            for (int i = size() - 1; i > index -1; i--) {
                data[i + 1] = get(i);
            }
            set(index, element); 
            size++;
        }
    }

}
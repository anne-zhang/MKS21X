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
	     throw new IndexOutOfBoundsException();
	    return "";
	}
	String old = data[i];
	data[i] = element;
	return old;
    }
    
    public String get(int i){
	if(i >= size || i < 0){
	     throw new IndexOutOfBoundsException();
	    return "";
	}
	return data[i];
    }
     public boolean contains(String target){
	for(int i = 0; i < size; i++){
	    if(data[i] == target){
		return true;
	    }
	}
	return false;
    }
    
    public int IndexOf(String element){
	for (int i = 0; i < size; i++){
	    if(data[i] == element){
		return i;
	    }
	}
	return -1;
    }
    
    
    public int lastIndexOf(String element){   
	for(int i = size; i >= 0; i--){
	    if(data[i] == element){
		return i;
	    }
	}
	return -1;
    }

 	public void add(int index, String element){  
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }else {
            newsize();
            for (int i = size() - 1; i > index -1; i--) {
                data[i + 1] = get(i);
            }
            set(index, element); 
            size++;
        }
    }
    public String toString(){
	String returnString = "[";
	int i = 0; 
	for(; i + 1 < size; i++){
	    returnString += data[i] + ",";
	}
	returnString += " " + data[i] + "]";
	return returnString;
    }
    
    public int indexOf(String element){
		for (int i = 0; i < size; i++){
	    	if (data[i].equals(element)){
				return i;
	    	}
		}
		return -1;
    }
    
    public String remove(int i){
	if(i < 0 || i >= size){
	    throw new IndexOutOfBoundsException();
	    return "";
	}
	String removedElement = data[i];
	for(int total = i; total < size; total++){
	    data[total] = data[total + 1];
	}
	size--;
	return removedElement;
    }
    
     public boolean remove(String element){
		if (contains(element)){
	    	remove(indexOf(element));
	    	return true;
		}
		return false;
    }

}
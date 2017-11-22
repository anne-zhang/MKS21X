
public class SuperArray{
    private int size;
    private String[] data;

    public SuperArray(){
    this.data = data;
    this.size = size;
	data = new String[10];
	size = 0;
    }
//Removes all of the elements from this list.
    public void clear(){
	data = new String[10];
	size = 0;
    }
//Returns the number of elements in this list.
    public int size(){
	return size;
    }
//Returns true if this list contains no elements.
    public boolean isEmpty(){
	return size == 0;
    }
//Appends the specified element to the end of this list. Returns true.
    public boolean add(String element){
	newsize();
	data[size] = element;
	size++;
	return true;
    }
//Used in other methods and resizes!!
    private void newsize(){
	if(data.length + 1 == size){
	    String[] newData = new String [size * 2];
	    for(int i = 0; i < size; i++){
		newData[i] = data[i];
	    }
	    data = newData;
	}
    }

//Returns the element at the specified position in this list.
    public String get(int i){
	if(i >= size || i < 0){
	    System.out.println("Error: Index out of bounds");
	    return "";
	}
	return data[i];
    }
//Replaces the element at the specified position in this list with the specified element, returns the old element.
    public String set(int i, String element){
	if(i < 0 || i >= size){
	    System.out.println("Error: Index out of bounds");
	    return "";
	}
	String oldString = data[i];
	data[i] = element;
	return oldString;
    }
//Returns the data in the format: "[A, B, FISH, cat, Dog]" Without double quotes around the data elements.   
	public String toString(){
	int i = 0;
	String returnString = "[";
	for(; i + 1 < size; i++){
	    returnString += data[i] + ",";
	}
	returnString += " " + data[i] + "]";
	return returnString;
    }
//Returns true if this list contains the specified element.
    public boolean contains(String target){
	for(int i = 0; i < size; i++){
	    if(data[i] == target){
		return true;
	    }
	}
	return false;
    }
//All elements at the index or to the right, are shifted to the right to make space, then insert the specified element at the specified position in this list. 
    public void add(int i, String element){
	newsize();
	if(i < 0 || i > size){
	    System.out.println("Error: Index out of bounds");
	}
	else{   
	    for(int total = size; total >= i; total--){
		data[total + 1] = data[total];
	    }
	    data[i] = element;
	    size++;
	}
    }

//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    public int IndexOf(String element){
	for (int i = 0; i < size; i++){
	    if(data[i] == element){
		return i;
	    }
	}
	return -1;
    }
//Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    public int lastIndexOf(String element){   
	for(int i = size; i >= 0; i--){
	    if(data[i] == element){
		return i;
	    }
	}
	return -1;
    }
//Removes the element at the specified position in this list and shifts all subsequent elements to the left. Return the element removed.
    public String remove(int i){
	if(i < 0 || i >= size){
	    System.out.println("Error: Index out of bounds");
	    return "";
	}
	String removedElement = data[i];
	for(int total = i; total < size; total++){
	    data[total] = data[total + 1];
	}
	size--;
	return removedElement;
    }
//Removes the first occurrence of the specified element from this list if it is present. Shift all the subsequent elements to the left. 
    public boolean remove(String element){
	int total;
	for(int newtotal = total; total < size; total++){
	    data[total] = data[total + 1];
	}
	size--;
	return true;
    }
	for(total = 0; data[total] != element; total++){
	    if(total == size){
		return false;
	    }
	}
}
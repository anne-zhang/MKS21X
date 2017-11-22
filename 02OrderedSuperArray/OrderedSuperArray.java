public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
    	super();
    }
    public OrderedSuperArray(int capacity){
    	super(capacity);
    }
    public OrderedSuperArray(String[] ary){
    	super(ary);
    }

    public int indexOfBinary(String element){
       	int first = 0;
        int last = size() - 1;
        int middle;
        
        while (last >= first) {

            middle = (last + first) / 2;

            if (element.compareTo(get(middle)) < 0) {
                last = middle - 1;
            } 
            else if (element.compareTo(get(middle)) > 0) {
                first = middle + 1;
            } 
            else {
            
		while (get(middle-1)==get(middle)){
		    middle -= 1;
		}
                return middle;
            }
        }
        return -1;
    }
    private int findIndex(String element){
    	for (int i = 0; i < size(); i++){
    		if (element.compareTo(get(i)) < 0){
    			return i;
    		}
    	}
 
    	return size();
    }
    private int findIndexBinary(String element){
       	int first = 0;
        int last = size() - 1;
        int middle;
        
        while (true) {
            middle = (first + last) / 2;
            if (element.compareTo(get(middle)) == 0){
            	return middle;
            }
            else if (element.compareTo(get(middle)) > 0) {
                low = middle + 1;
                if (low > high){
                	return middle+1;
                }
            } 
            else{
                high = middle - 1;
                if (low > high){
                	return middle;
                }
            } 
        }
    }

    
    public void add(int index, String value){
    	add(value);
    }
    
    
     public boolean add(String element) {
	int x = 0;
	boolean y = false;
	while (!y && x < size()) {
	    if (element.compareTo(getData()[x]) >= 0) {
		super.add(x, element);
	    }
	    x ++;
	}
	return y;
    }
}
}

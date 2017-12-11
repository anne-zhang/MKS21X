import java.util.Arrays;                                                            
public class Sorts{                                                                 
                                                                                    
    public static String name(){                                                    
        return "10.Zhang.Anne";                                                  
    }     
    
    public static void swap(int[] ary, int a, int b){
    int c = ary[a];
    ary[a] = ary[b];
    ary[b] = c;
  } 
                                                                            
     public static void selectionSort(int[] data) {
	for (int x = 0; x < data.length - 1; x++) {
	    int minimum = x;
	    for (int i = x + 1; i < data.length; i++) {
		if (data[minimum] > data[i]) {
		    minimum = i;
		}
	    }
	    int j = data[x];
	    data[x] = data[minimum];
	    data[minimum] = j;
	}
    }

    public static void insertionSort(int[] data) {
	for (int x = 0; x < data.length - 1; x++) {
	    for (int i = x + 1; i > 0; i--) {
		if (data[i] < data[i - 1]) {
		    int j = data[i];
		    data[i] = data[i - 1];
		    data[i - 1] = j;
		}
	    }
	}
    }
    
    public static void bubbleSort(int[] data){
    for(int x = 0; x < data.length; x++) {
    	for(int i = 0; i < data.length - x -1; i++){
    		if(data[i] > data[i+1]){
    		swap(data, i, i+1);
    		}
    	}
    }
                                                                            
                                                                        
}
}
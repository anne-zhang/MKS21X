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
 public static void main(String[]artie){
    long startTime = System.currentTimeMillis();
    int[] randish = new int[1000];
    //int[] randish = new int[0];
    //int[] randish = new int[1];
    //int[] randish = new int[2];
    //int[] randish = new int[3];
    //int[] randish = new int[100000];

    for(int i = 0 ; i < randish.length; i++){ //PURELY RANDOM
      randish[i] = (int)(Math.random()*100);
    }

    //for(int i = 0 ; i < randish.length; i++){ //ALL THE SAME NUMBER OR YOU CAN JUST RUN CODE WITHOUT ANY FOR LOOPS
    //  randish[i] = 1;
    //}

    //for(int i = 0 ; i < randish.length; i++){ //BIGGEST TO SMALLEST
    //  randish[i] = randish.length - i;
    //}

    //for(int i = 0 ; i < randish.length; i++){ // SMALLEST to BIGGEST
    //  randish[i] = i;
    //}

    System.out.println(Arrays.toString(randish));

    //Sorts Tests Here:

    //System.out.println("selectionSort:");
    //selectionSort(randish);

    //System.out.println("insertionSort:");
    //insertionSort(randish);

    System.out.println("bubbleSort:");
    bubbleSort(randish);

    System.out.println(Arrays.toString(randish));

    System.out.println("Runtime: " +
                       (System.currentTimeMillis() - startTime) + "ms or " +
                       (System.currentTimeMillis() - startTime)/1000.0 + "s"
                       );

  }

}
package Array;
import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		
		// Array declaration
		
		int arr[] = new int[10];
		
	    arr[0]=10;
	    arr[1]=20;
	    arr[2]=30;
	    arr[3]=40;
	    arr[4]=50;
	    arr[5]=70;
	    arr[6]=60;
	    arr[7]=90;
	    arr[8]=80;
	    arr[9]=100;
	    
	    //Printing the array
	    
	    
	    System.out.println(arr[8]); // single print karaych asel tr
	    
	    for(int i=0;i<arr.length;i++) {   
	   // for (int i=0;i<=arr[9];i++)
	    	
	    	System.out.println(arr[i]);
	    	
	    }
	    
	    // Printing the arrays lenght
	    System.out.println("Lenght of array:"+(arr.length));
	    
	    
	    // Sorting the array
	    
	    Arrays.sort(arr);
	    
	    System.out.println("Sorted array:");
	    
	    for(int i=0;i<arr.length;i++) {
	    	
	    	System.out.print(arr[i]+" ");
	    }
		

	}

}


public class BubbleSort {

		public int[] bubbleSort(int arr[]) {
			
	        int lA = arr.length;
	        
	        int temp;
	        
	        for (int i=0 ; i< (lA) ; i++) {
	            for (int j=1;j< (lA-i) ;j++) {
	                if (arr[j-1] > arr[j]) {
	                    temp = arr[j-1];
	                    arr[j-1] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        
	        for (int i=0;i<lA;i++) {
	            System.out.print(arr[i]+" ");
	        }
	        
	        return null;
	    }

}


public class SearchArray {
	
	static int flag=0;
	
    public boolean searchArray(int[] arr,int toCheckValue){
    	
        for(int i=0;i<arr.length;i++){
        	
            if(arr[i]==toCheckValue){
                System.out.println("Number present");
                flag = 1;
                break;
            }
            
            else {
                flag=0;
            }
            
        }
        
        if(flag==0){
            System.out.println("Number not present");
        }
        
       return false;
    }
}

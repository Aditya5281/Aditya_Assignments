
public class GenericQ3 {
	public <T> T[] exchange(T[] arr)
	{
		for(int i=0;i<arr.length/2;i++)
		{
			
			T temp;
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		}
		return arr;
	}

}

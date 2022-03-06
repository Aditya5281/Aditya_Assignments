
public class Assignment1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumBetweenRange anr = new ArmstrongNumBetweenRange();
		System.out.println(anr.armstrongNumbersInRange(100, 999));
	}

}

public class ArmstrongNumBetweenRange {

	public int[] armstrongNumbersInRange(int min , int max){
		int n=1,r,res=0,i;
		int[] ia = new int[n];

		for(i=min;i<=max;i++) {
			
			 n=i;
			 r=n%10;
			 res=res+r*r*r;
			 n=n/10;
		}
		if(res==n) {
		    ia[i]=res;
		}
		return ia;
	}

}
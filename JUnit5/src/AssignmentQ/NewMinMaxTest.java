package AssignmentQ;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class NewMinMaxTest {
	AssignmentQ1 minMax;
	
	
	@Test
	@DisplayName("Min and Max Finder")
	
	public void findMinMaxTest() {
		minMax = new AssignmentQ1();
		int arr[] = {5, 8, 2, 9};		
		int expected[] = {2, 9};
		int actual[] = minMax.findMinMax(arr);
		assertTrue(Arrays.equals(expected, actual));
		//assertEquals(expected, actual);
		
		int arr1[] = {51, -82, 0, 9};
		int expected1[] = {-82, 51};
		assertTrue(Arrays.equals(expected1, minMax.findMinMax(arr1)));
		
		int arr2[] = {0, 0, 0, 0};
		int expected2[] = {0, 0};
		assertTrue(Arrays.equals(expected2, minMax.findMinMax(arr2)));
		
	}

}

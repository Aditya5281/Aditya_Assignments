package AssignmentQ2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NewMinMaxFinderTest {
	
	MinMaxFinder minMax;

	@Test
	@DisplayName("Testing Find Min Max Function")
	public void findMinMaxTest() {
		minMax = new MinMaxFinder();
		int arr[] = {5, 8, 2, 9};		
		String expected = Integer.toString(28);
		String actual = minMax.findMinMax(arr);
		assertEquals(expected, actual);

	}
}
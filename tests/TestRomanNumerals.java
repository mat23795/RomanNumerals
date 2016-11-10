import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestRomanNumerals {

	@Test (expected = InvalidInputException.class)
	public void isValidInputNumerTest() throws InvalidInputException {
		//Act
		String validString = "XVI";
		String invalidString = "ABC";
		RomanNumerals.convertToInteger(invalidString);
		
		
		//fail("Not yet implemented");
	}

}

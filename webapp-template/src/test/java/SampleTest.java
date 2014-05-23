import org.junit.Assert;
import org.junit.Test;


public class SampleTest {
	
	/**
	 * Sample test
	 * @throws Exception
	 */
	@Test
	public void testBoolean() throws Exception {
		boolean success = true;
		Assert.assertTrue("Boolean success is set to false", success);
	}
}

package java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {
	@Test
	public void testSum() {
		Caculator caculartor = new Caculator();
		Assert.assertEquals(caculartor.sum(2,3),5);
	}
	
	@Test
	public void TestSub() {
		Caculator caculator = new Caculator();
		Assert.assertEquals(caculator.sub(2,2),0);
	}
}

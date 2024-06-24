package testing.src.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;


class MyAssertTest {
	List<String> todos = Arrays.asList("AWS", "AZURE", "GCP");

	@Test
	void test(){
		
		boolean test = todos.contains("AWS");
		// assertEquals(true, test);
		assertTrue(test);
		assertEquals(3, todos.size());
	}

}

package testing.src.junit.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	@BeforeAll
	static void beforeAll(){
		System.out.println("Before All");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("BeforeEach");
	}

	@Test
	void test1() {
		System.out.println("Test executed 1");
	}

	@Test
	void test2() {
		System.out.println("Test executed 2");
	}

	@AfterEach
	void afterEach() {
		System.out.println("afterEach");
	}

	@Test
	void test3() {
		System.out.println("Test executed 3");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("after  All");
	}

}

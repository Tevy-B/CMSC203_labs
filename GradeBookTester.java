import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester{
	GradeBook a;
	GradeBook b;
	@BeforeEach
	void setUp() throws Exception {
		a = new GradeBook(5);
		b = new GradeBook(5);		
		
		a.addScore(100.0);
		a.addScore(98.0);
		b.addScore(100.0);
		b.addScore(99.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		a = null;
		b = null;
		
		
	}

	@Test
	void testGetScoreSize() {
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue((a.toString()).equals("100.0 98.0 "));
		assertTrue(b.toString().equals("100.0 99.0 "));
		
		assertEquals(2, a.getScoreSize(), .001);
		assertEquals(2, b.getScoreSize(), .001);
		
		//fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(198.0, a.sum(), .0001);
		assertEquals(199.0, b.sum(), .0001);
		//fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		assertEquals(98.0, a.minimum(), .001);
		assertEquals(99.0, b.minimum(), .001);
		//fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		assertEquals(100.0, a.finalScore(), .001);
		assertEquals(100.0, b.finalScore(), .001);
		//fail("Not yet implemented");
	}

}

import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceMult() {
    int[] input1 = { 3 , 5 , 1 , 7 , 9 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9 , 7 , 1 , 5 , 3 }, input1);
	}

  @Test
  public void testReversedMult() {
    int[] input1 = { 2 , 4 , 6};
    assertArrayEquals(new int[]{ 6 , 4 , 2 }, ArrayExamples.reversed(input1));
  }
}

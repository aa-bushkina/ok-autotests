package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleTest
{
  @Test
  public void compareEqualNumbers()
  {
    assertEquals(1, 1);
  }

  @Test
  public void compareCalculations()
  {
    int a = 3;
    int b = 5;
    assertEquals(a + b, 8);
  }

  @Test
  public void compareStrings()
  {
    String a = "Hello";
    String b = " world";
    StringBuilder c = new StringBuilder(a + b);

    assertEquals(c.toString(), "Hello world");
  }

}

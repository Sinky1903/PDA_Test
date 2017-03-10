import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class TestPda {

  Pda pda;

  @Before
  public void Before() {
    pda = new Pda();
  }


  @Test
  public void testFunc1() {
    assertEquals(true, pda.func1(1));
  }

  @Test
  public void testMax() {
    assertEquals(5, pda.max(5, 3));
  }

  @Test
  public void testLooper() {
    assertEquals(11, pda.looper());
  }

  @Test
  public void testCheckLoop() {
    assertEquals("looper failed", pda.checkLoop());
  }


}
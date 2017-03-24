import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditonTest {
  @Test
  public void addTest1 {
    Addtion add = new Addition();
	int res = add.result(2,3)
    assertEquals(5, res);
  }
  @Test
	public void addTest12 {
    Addtion add = new Addition();
	int res = add.result(11,20)
    assertEquals(32, res);
}
  @Test
public void addTest3 {
    Addtion add = new Addition();
	int res = add.result(2,3)
    assertEquals(6, res);
} 
  
}
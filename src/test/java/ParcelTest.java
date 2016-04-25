import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcelExsits() {
    Parcel testParcel = new Parcel(3,3,3,5);
    assertEquals(true, testParcel instanceof Parcel);
  }
  @Test
  public void ParcelVolumeCorrect() {
    Parcel testParcel = new Parcel(3,3,3,5);
    assertEquals(27, testParcel.volume());
  }
  @Test
  public void CostToShip() {
    Parcel testParcel = new Parcel(3,3,3,5);
    assertEquals(3.2, testParcel.cost(), 0);
  }
}

import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

//confirms we can successfully instatite hero object
@Test
public void Hero_instatiatesCorrectly_true() {
  assertsEquals(true, mHero instanceof Hero);
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomsIteratorTest {

    @Test
    @DisplayName("random test")
    public void randomTest() {

        Randoms randoms = new Randoms(90, 100);
        Integer num = randoms.iterator().next();
        Assertions.assertTrue(num >= 90 && num <= 100);
    }
}

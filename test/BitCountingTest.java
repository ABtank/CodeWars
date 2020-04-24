import org.junit.Test;
import ru.abramov.codewars.BitCounting;

import static org.junit.Assert.assertEquals;


public class BitCountingTest {
    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }

    @Test
    public void testGameTwo() {
        assertEquals(5, BitCounting.countBitsTwo(1234));
        assertEquals(1, BitCounting.countBitsTwo(4));
        assertEquals(3, BitCounting.countBitsTwo(7));
        assertEquals(2, BitCounting.countBitsTwo(9));
        assertEquals(2, BitCounting.countBitsTwo(10));
    }
}
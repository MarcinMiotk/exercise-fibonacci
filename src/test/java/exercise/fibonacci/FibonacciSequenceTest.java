package exercise.fibonacci;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.Stopwatch;
import org.junit.rules.Timeout;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 */
@RunWith(Parameterized.class)
public class FibonacciSequenceTest {

    final FibonacciSequence instance;

    public FibonacciSequenceTest(FibonacciSequence instance) {
        this.instance = instance;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> possibleImplementations() {
        ArrayList<Object[]> impls = new ArrayList<>();
        impls.add(new Object[]{new FibonacciSequenceImpl()});
        impls.add(new Object[]{new FibonacciSequenceStackImpl()});
        return impls;
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNegativeThenArgumentException() {
        instance.getFibonacciSequenceElementFromPosition(-1);
    }

    @Test
    public void whenZeroThenZero() {
        assertEquals(0, instance.getFibonacciSequenceElementFromPosition(0));
    }

    @Test
    public void whenOneThenOne() {
        assertEquals(1, instance.getFibonacciSequenceElementFromPosition(1));
    }

    @Test
    public void whenTwoThenOne() {
        assertEquals(1, instance.getFibonacciSequenceElementFromPosition(2));
    }

    @Test
    public void whenThreeThenTwo() {
        assertEquals(2, instance.getFibonacciSequenceElementFromPosition(3));
    }

    @Test
    public void whenFourThenThree() {
        assertEquals(3, instance.getFibonacciSequenceElementFromPosition(4));
    }

    @Test
    public void when5Then5() {
        assertEquals(5, instance.getFibonacciSequenceElementFromPosition(5));
    }

    @Test
    public void when6Then8() {
        assertEquals(8, instance.getFibonacciSequenceElementFromPosition(6));
    }

    @Test
    public void when7Then13() {
        assertEquals(13, instance.getFibonacciSequenceElementFromPosition(7));
    }

    @Test
    public void when8Then21() {
        assertEquals(21, instance.getFibonacciSequenceElementFromPosition(8));
    }

    @Test
    public void when9Then34() {
        assertEquals(34, instance.getFibonacciSequenceElementFromPosition(9));
    }

    @Test
    public void when10Then55() {
        assertEquals(55, instance.getFibonacciSequenceElementFromPosition(10));
    }

    @Test
    public void when11Then89() {
        assertEquals(89, instance.getFibonacciSequenceElementFromPosition(11));
    }

    @Test
    public void when12Then144() {
        assertEquals(144, instance.getFibonacciSequenceElementFromPosition(12));
    }

    @Ignore
    @Test
    public void whenLong() {
        assertEquals(144, instance.getFibonacciSequenceElementFromPosition(100));
    }

    @Rule
    public Timeout globalTimeout = new Timeout(100);

    @Rule
    public Stopwatch stopWatch = new Stopwatch() {

        @Override
        protected void succeeded(long nanos, Description description) {
            System.out.println("I took " + nanos + " to run " + description);
        }

    };

}

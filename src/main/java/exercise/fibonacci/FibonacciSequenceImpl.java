package exercise.fibonacci;

/**
 *
 */
public class FibonacciSequenceImpl implements FibonacciSequence {

    public int getFibonacciSequenceElementFromPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Should be zero or positive");
        } else if (position <= 1) {
            return position;
        } else {
            return getFibonacciSequenceElementFromPosition(position - 2) + getFibonacciSequenceElementFromPosition(position - 1);
        }
    }

}

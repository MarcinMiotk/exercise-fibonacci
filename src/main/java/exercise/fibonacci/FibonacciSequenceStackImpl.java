package exercise.fibonacci;

public class FibonacciSequenceStackImpl implements FibonacciSequence {

    private final FibonacciSequenceImpl impl1 = new FibonacciSequenceImpl();

    @Override
    public int getFibonacciSequenceElementFromPosition(int position) {
        return impl1.getFibonacciSequenceElementFromPosition(position);
    }

}

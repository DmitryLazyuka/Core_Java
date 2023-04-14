package ch03.sec03.exercise4;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;
public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence constant(int i){
        return new IntSequence() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return i;
            }
        };
    }
    static IntSequence of(int... args) {

        return new IntSequence() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < args.length;
            }

            @Override
            public int next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return args[index++];
            }
        };
    }
}
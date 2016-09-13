package iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Alasad on 2016/8/28.
 */
public class SubIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}

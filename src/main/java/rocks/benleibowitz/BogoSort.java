package rocks.benleibowitz;

import lombok.RequiredArgsConstructor;
import rocks.benleibowitz.validator.SortedValidator;

import java.util.Collections;
import java.util.List;

/**
 * A Bogosort implementationm
 *
 * @param <E> type
 * @see <a href="https://en.wikipedia.org/wiki/Bogosort">Bogosort Wikipedia</a>
 */
@RequiredArgsConstructor
public class BogoSort<E extends Comparable<E>> {
    private final List<E> list;

    public void sort() {
        SortedValidator<E> validator = new SortedValidator<>(list);
        while (!validator.isListSorted()) {
            Collections.shuffle(list);
        }
    }
}

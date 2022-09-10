package rocks.benleibowitz;

import lombok.RequiredArgsConstructor;
import rocks.benleibowitz.validator.SortedValidator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * A Bogobogosort implementation
 *
 * @param <E> type
 * @see <a href="https://en.wikipedia.org/wiki/Bogosort#Bogobogosort">Bogobogosort Wikipedia</a>
 */
@RequiredArgsConstructor
public class BogoBogoSort<E extends Comparable<E>> {
    private final List<E> list;

    public void sort() {
        List<E> tempList = new LinkedList<>();

        for (E item : list) {
            tempList.add(item);
            new BogoSort<>(tempList).sort();
        }

        for (int i = 0; i < tempList.size(); i++) {
            list.set(i, tempList.get(i));
        }
    }
}

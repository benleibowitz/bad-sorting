package rocks.benleibowitz;

import lombok.RequiredArgsConstructor;
import rocks.benleibowitz.validator.SortedValidator;

import java.util.Collections;
import java.util.List;

/**
 * Quantum bogosort
 *
 * Generates a random permutation of its input using a quantum source of entropy,
 * checks if the list is sorted, and, if it is not, destroys the universe.
 *
 * Assuming that the many-worlds interpretation holds, the use of this algorithm
 * will result in at least one surviving universe where the input was successfully
 * sorted in O(n) time.
 *
 * @param <E> type
 * @see <a href="https://en.wikipedia.org/wiki/Bogosort#Related_algorithms">Wikipedia</a>
 */
@RequiredArgsConstructor
public class QuantumBogoSort<E extends Comparable<E>> {
    private final List<E> list;

    public void sort() {
        SortedValidator<E> validator = new SortedValidator<>(list);
        while (!validator.isListSorted()) {
            // TODO destroy the universe
        }
    }
}

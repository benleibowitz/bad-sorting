package rocks.benleibowitz;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import rocks.benleibowitz.validator.SortedValidator;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Miraclesort implementation. Algorithm:
 *
 * <pre>
 *     - Is the list sorted?
 *       - Yes => we're done
 *       - No => wait for a miracle and try again
 * </pre>
 *
 * @param <E> type
 * @see <a href="https://stackoverflow.com/a/6947808">Miracle sort</a>
 */
@RequiredArgsConstructor
public class MiracleSort<E extends Comparable<E>> {
    private final List<E> list;

    public void sort() {
        SortedValidator<E> validator = new SortedValidator<>(list);
        while (!validator.isListSorted()) {
            try {
                // Wait for a miracle
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

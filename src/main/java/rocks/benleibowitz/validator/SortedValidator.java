package rocks.benleibowitz.validator;

import com.google.common.collect.Comparators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.List;

/**
 * A class to validate that the given list is sorted
 *
 * @param <E> type contained in the list
 */
@RequiredArgsConstructor
public class SortedValidator<E extends Comparable<E>> {
    @NonNull
    private final List<E> list;

    public boolean isListSorted() {
        return Comparators.isInOrder(list, Comparator.naturalOrder());
    }
}

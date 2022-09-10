package rocks.benleibowitz;

import com.google.common.collect.Comparators;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@Test
public class BogoBogoSortTest {

    public void testSort() {
        List<Integer> toSort = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            toSort.add(i);
        }
        Collections.shuffle(toSort);

        new BogoBogoSort<>(toSort).sort();
        Assert.assertTrue(Comparators.isInOrder(toSort, Comparator.naturalOrder()));
    }
}
package rocks.benleibowitz;

import com.google.common.collect.Comparators;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Test
public class BogoSortTest {

    public void testSort() {
        List<Integer> toSort = new ArrayList<>() {{
            add(1);
            add(3);
            add(5);
            add(4);
        }};

        new BogoSort<>(toSort).sort();
        Assert.assertTrue(Comparators.isInOrder(toSort, Comparator.naturalOrder()));
    }
}
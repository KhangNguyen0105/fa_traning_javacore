package fa.training.sortingdemo.test;

import fa.training.sortingdemo.*;

public class TestSortingDemo {
    public static void main(String[] args) {
        ArraySortingExample arraySortingExample = new ArraySortingExample();
        ArrayListSortingExample arrayListSortingExample = new ArrayListSortingExample();
        SortingComparableExample sortingComparableExample = new SortingComparableExample();
        SortingComparatorExample sortingComparatorExample = new SortingComparatorExample();

        arraySortingExample.sortArray();
        arrayListSortingExample.sortArrayList();
        sortingComparableExample.sortElementWithComparable();
        sortingComparatorExample.sortElementComparator();
    }
}

package sortings.deprecated.tt;

public class InsertionSort implements Sorting {
    @Override
    public <E extends Comparable<E>> E[] sort(E[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (j - 1 >= 0 && array[j - 1].compareTo(array[j]) < 0) {
                    SortingUtils.swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return array;
    }
}

package sortings.deprecated.tt;

public interface Sorting {

    <E extends Comparable<E>> E[] sort(E[] array);
}

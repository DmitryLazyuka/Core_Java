package ch06.sec06.exercise09;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arrays {
    public static <E extends Comparable<E>> Pair<E> firstLast(List<E> a){
        return new Pair<>(a.get(0), a.get(a.size()-1));
    }

    public static <E extends Comparable<E>> E getMin(List<E> a){
        return Collections.min(a);
    }
    public static <E extends Comparable<E>> E getMax(List<E> a){
        return Collections.max(a);
    }

    public static <E extends Comparable<E>> Pair<E> minMax(List<E> a){
        return new Pair<>(getMin(a), getMax(a));
    }
    public static <E> void minmax(List<E> elements, Comparator<? super E> comp, List<? super E> result){
        E min = Collections.min(elements,comp);
        E max = Collections.max(elements, comp);
        result.add(min);
        result.add(max);
    }

}
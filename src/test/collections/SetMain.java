package test.collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SetMain {


  public static void main(String[] args) {
    NavigableSet<Integer> set = new TreeSet<>();
    set.add(1);
    set.add(10);
    set.add(2);
    set.add(6);
    set.add(3);
    set.add(4);
    set.add(9);
    set.add(5);
    set.add(7);
    set.add(8);

    System.out.println(set.higher(6));
    System.out.println(set.headSet(9));
  }


  private static Set<Integer> getPrevElements(int element) {
    return IntStream.range(1, element).boxed().collect(Collectors.toSet());
  }
}

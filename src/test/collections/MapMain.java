package test.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMain {

  public static void main(String[] args) {
    Map<Integer, String> hashMap = new LinkedHashMap<>();

    hashMap.put(5,"a");
    hashMap.put(4,"b");
    hashMap.put(3,"c");
    hashMap.put(2,"d");
    hashMap.put(1,"e");

    System.out.println(hashMap);
  }
}

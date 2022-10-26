package test.thread;

public class MainTread {

  private static int counter1 = 0;
  private static int counter2 = 0;

  static final Object lock1 = new Object();
  static final Object lock2 = new Object();


  public static void main(String[] args) {

    Thread thread1 = new Thread(() -> {
      System.out.println("TREAD 1 ");
      loop1();
    }
  );

  Thread thread2 = new Thread(() -> {
    System.out.println("TREAD 2 ");
    loop2();
  });


    thread1.start();
    thread2.start();

}


  private static void loop1() {
    synchronized (lock1) {
      while (true) {
        System.out.printf("INCREASE 1 = %d %n", counter1);
        counter1++;
      }
    }
  }

  private static void loop2() {
    synchronized (lock2) {
      while (true) {
        System.out.printf("INCREASE 2 = %d %n", counter2);
        counter2++;
      }
    }
  }
}

package test.thread;

public class MyThread implements Runnable{

  private int counter1 = 0;
  private int counter2 = 0;

  final Object lock1 = new Object();
  final Object lock2 = new Object();


  @Override
  public void run() {

  }

  public int getCounter1() {
    synchronized (lock1){
    return counter1;
    }
  }

  public void increase1(){
    synchronized (lock1){
    System.out.printf("INCREASE1 %d %n", counter1);
    counter1++;
    }
  }

  public int getCounter2() {
    synchronized (lock2){
      return counter2;
    }
  }
  public void increase2(){
    synchronized (lock2){
    System.out.printf("INCREASE2 %d %n", counter2);
    counter2++;
    }
  }

  public void loop1(){
    synchronized (lock2){
      while (true){
        System.out.printf("INCREASE 2 = %d %n", counter1);
        counter1++;
      }
    }
  }

  public void loop2(){
    synchronized (lock2){
      while (true){
        System.out.printf("INCREASE 2 = %d %n", counter2);
        counter2++;
      }
    }
  }

}

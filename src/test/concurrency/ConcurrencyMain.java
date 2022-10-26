package test.concurrency;

public class ConcurrencyMain {

  public static void main(String[] args) throws InterruptedException {
    Account account1 = new Account(1000);
    Account account2 = new Account(2000);

    new Thread(() -> {
      try {
        Operations.transfer(account1,account2,500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }).start();

    Operations.transfer(account2,account1,300);

    System.out.println("Account 1 Balance = " + account1.getBalance());
    System.out.println("Account 2 Balance = " + account2.getBalance());

  }
}

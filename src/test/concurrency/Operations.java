package test.concurrency;

import test.concurrency.exception.NoSuchMoneyException;

public class Operations {

  public static void transfer(Account sender, Account recipient, int amount) throws InterruptedException {
    if (sender.getBalance() < amount) {
      throw new NoSuchMoneyException("Sender account don't have enough money");
    }
    synchronized (sender) {
      Thread.sleep(3000);
      synchronized (recipient) {
        sender.withdraw(amount);
        recipient.deposit(amount);
      }
    }
  }
}

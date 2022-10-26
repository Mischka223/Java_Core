package test.concurrency;

import java.util.StringJoiner;

public class Account {

  private int balance;

  public Account(int initialBalance) {
    this. balance = initialBalance;
  }

  public void withdraw(int amount) {
    balance -= amount;
  }

  public void deposit(int amount) {
    balance += amount;
  }

  public int getBalance() {
    return balance;
  }
}

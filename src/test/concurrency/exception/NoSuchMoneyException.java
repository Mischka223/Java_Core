package test.concurrency.exception;

public class NoSuchMoneyException extends RuntimeException{


  public NoSuchMoneyException(String message) {
    super(message);
  }
}

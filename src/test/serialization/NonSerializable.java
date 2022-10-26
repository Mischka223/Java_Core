package test.serialization;

public class NonSerializable {

  private String myData = "MyData";

  public String getMyData() {
    return myData;
  }

  public NonSerializable setMyData(String myData) {
    this.myData = myData;
    return this;
  }
}

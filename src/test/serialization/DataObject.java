package test.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.StringJoiner;

public class DataObject extends NonSerializable implements Serializable {

  private int i = 5;

  private String s = "BVM";

  private String[] def = {"AUDI", "HRW", "WQF"};

  private CustomObject customObject = new CustomObject();


  @Override
  public String toString() {
    return new StringJoiner(", ", DataObject.class.getSimpleName() + "[", "]")
        .add("i=" + i)
        .add("s='" + s + "'")
        .add("def=" + Arrays.toString(def))
        .add("customObject=" + customObject)
        .add("myData=" + getMyData())
        .toString();
  }

///**
// * Added for possibility write fields of class that doesn't implement Serializable
// * **/
//  private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
//    objectOutputStream.defaultWriteObject(); //need to execute always
//    objectOutputStream.writeObject(getMyData());
//  }
//
//  /**
//   * Added for possibility read fields of class that doesn't implement Serializable
//   * **/
//  private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
//    objectInputStream.defaultReadObject();
//    String myData = (String)objectInputStream.readObject();
//    setMyData(myData);
//  }
}

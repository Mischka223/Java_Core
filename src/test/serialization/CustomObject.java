package test.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.StringJoiner;


public class CustomObject implements Externalizable {
  String stringCustomObject = "fasfasfa";
  transient boolean b;

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {

  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

  }

  @Override
  public String toString() {
    return new StringJoiner(", ", CustomObject.class.getSimpleName() + "[", "]")
        .add("stringCustomObject='" + stringCustomObject + "'")
        .add("b=" + b)
        .toString();
  }
}

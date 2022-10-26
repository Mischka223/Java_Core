package test.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

/**
 * Write object into file
 * **/
//  public static void main(String[] args) throws IOException {
//    DataObject dataObject = new DataObject();
//
//    dataObject.setMyData("fasgargairrngarngjnragnmkrngjNirnewnajnrgnargmkmbfngiopmgjanklngnvjlnifjbia");
//
//    File file = new File("store.bin");
//
//    FileOutputStream fileOutputStream = new FileOutputStream(file);
//
//    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//    objectOutputStream.writeObject(dataObject);
//
//    objectOutputStream.flush();
//    objectOutputStream.close();
//  }


  /**
   * Read object from File
   * **/
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("store.bin");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    DataObject dataObject = (DataObject) objectInputStream.readObject();

    objectInputStream.close();

    System.out.println(dataObject);
  }
}

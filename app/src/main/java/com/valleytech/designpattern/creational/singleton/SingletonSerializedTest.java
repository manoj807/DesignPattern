package com.valleytech.designpattern.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

    public static void main(String srt[]) throws IOException, ClassCastException, ClassNotFoundException {

        SerializedSingleton writeObject=SerializedSingleton.getInstance();

        ObjectOutput objectOutput=null;
        SerializedSingleton readObject=null;
         try {

              objectOutput = new ObjectOutputStream(new FileOutputStream("SerializedSingleton"));
             objectOutput.writeObject(writeObject);

         }catch (IOException e)
         {
           throw e;
         }finally {

             if(objectOutput!=null) {
                 objectOutput.close();
             }


         }

         ObjectInput objectInput=null;

         try {
             objectInput=new ObjectInputStream(new FileInputStream("SerializedSingleton"));

              readObject = (SerializedSingleton) objectInput.readObject();
         }catch (ClassCastException | IOException | ClassNotFoundException ecat)
         {
             throw ecat;
         }
         finally {

             if(objectInput!=null) {
                 objectInput.close();
             }

         }

         System.out.println("writeObject::"+writeObject.hashCode());
        System.out.println("readObject::"+readObject.hashCode());


    }
}

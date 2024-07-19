package lk.ijse.gdse68;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedClass {
    public static void main(String[] args) {
        Person person =new Person("Saman", 55,"Galle");

        try (FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
            System.out.println(person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

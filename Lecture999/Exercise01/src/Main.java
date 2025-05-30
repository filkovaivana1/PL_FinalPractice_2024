import javax.imageio.IIOException;
import java.io.*;

public class Main {

    public static void printData(Example e){

        System.out.println("Name: " + e.name);
        System.out.println("Age: "  + e.age);
        System.out.println("TransientInt: " + e.transientInt);
        System.out.println("StaticInt: " + e.staticInt);
    }

    public static void main(String[] args) {

        Example example = new Example(4, "Name", 4, 5);

        String fileName = "test.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(example);
            System.out.println("Before deserialization: ");
            printData(example);

            example.staticInt = 400;
            example.name = "test";

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            example = (Example) objectInputStream.readObject();
            System.out.println("Object is deserialized, after deserialization: ");
            printData(example);

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }



    }
}
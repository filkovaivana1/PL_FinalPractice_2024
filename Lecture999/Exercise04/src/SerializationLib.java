import java.io.*;

public class SerializationLib {
    public static void doSerialize(Object o, String file_name) throws IOException, ClassNotFoundException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file_name);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            System.out.println("Before Serialization:");
            System.out.println(o);

            System.out.println("\nObject Has Been Serialized!");
            objectOutputStream.writeObject(o);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error Opening File: " + e);
        }
    }

    public static void doDeserialize(String file_name) throws IOException{
        try {
            FileInputStream fileInputStream = new FileInputStream(file_name);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


            Object o = objectInputStream.readObject();
            System.out.println("\nObject Has Been Deserialized!\n");

            System.out.println("After Deserialization");
            System.out.println(o);

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error Opening File: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found: " + e);
        }


    }

}

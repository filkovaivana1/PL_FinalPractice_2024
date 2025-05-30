import java.io.*;

public class StudentFileStream {
    public void printData(Student s) {
        System.out.println("Name: " + s.name);
        System.out.println("Phone Nmber: " + s.phoneNum);
        System.out.println("Index Number: " + s.indexNum);
        System.out.println("Record Number: " + s.recordNum);
    }

    public void writeToFile(Student s, String file_name) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file_name);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            System.out.println("Before Serialization:");
            printData(s);

            System.out.println("\nObject Has Been Serialized!");
            objectOutputStream.writeObject(s);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error Opening File: " + e);
        }
    }

    public Student readFromFile(String file_name) {
        Student s = new Student();
        try {
            FileInputStream fileInputStream = new FileInputStream(file_name);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


            s = (Student) objectInputStream.readObject();
            System.out.println("\nObject Has Been Deserialized!\n");

            System.out.println("After Deserialization");
            printData(s);

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error Opening File: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found: " + e);
        }

        return s;
    }
}

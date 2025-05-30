import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.setProductID(1223);
        child.setProduct("Product");
        child.setBrand("Brand");

       try {
           SerializationLib.doSerialize(child, "childTest.txt");
           SerializationLib.doDeserialize("childTest.txt");
       } catch (IOException | ClassNotFoundException e) {
           System.out.println(e);
       }


    }
}
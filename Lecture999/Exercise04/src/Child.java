import java.io.*;

public class Child extends Parent implements Serializable, ObjectInputValidation {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){

        return brand + " " + getProduct() + " " + getProductID();
    }

//    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
//       objectInputStream.defaultReadObject();
//       setProduct((String) objectInputStream.readObject());
//       setProductID(objectInputStream.readInt());
//    }
//
//    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
//        objectOutputStream.defaultWriteObject();
//        objectOutputStream.writeObject(getProduct());
//        objectOutputStream.writeInt(getProductID());
//    }

    @Override
    public void validateObject() throws InvalidObjectException {

        if(brand == null || brand.equals("")){
            throw new InvalidObjectException("Invalid brand input");
        }

    }

}

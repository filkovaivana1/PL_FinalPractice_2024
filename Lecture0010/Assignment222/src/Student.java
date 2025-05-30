public class Student {


    private String name;
    private int indexNumber;
    private int age;

    public Student(String name, int indexNumber, int age) {
        this.name = name;
        this.indexNumber = indexNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public int getAge() {
        return age;
    }

   @Override
   public String toString(){
        return name + ", age: " + age + " , index: " + indexNumber;
   }

}

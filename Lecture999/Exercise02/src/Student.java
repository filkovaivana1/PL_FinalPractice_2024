import java.io.Serializable;

public class Student implements Serializable {
    public Student() {}

    public Student(String name, String phoneNum, int indexNum, int recordNum) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.indexNum = indexNum;
        this.recordNum = recordNum;
    }


    String name;
    String phoneNum;
    int indexNum;
    transient int recordNum;
}



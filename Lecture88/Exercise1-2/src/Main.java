import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {

            Test obj = new Test();
            Class classObj = obj.getClass();
            System.out.println("CLass name: " + classObj.getName());


            Constructor constructor = classObj.getConstructor();
            System.out.println("Con name: " + constructor.getName());

            Method[] methods = classObj.getDeclaredMethods();
            for(Method method : methods) {
                System.out.println("Method name: " + method.getName());
            }

            Method methodCall1 = classObj.getDeclaredMethod("method2", int.class);
            methodCall1.invoke(obj, 19);

            Field field1 = classObj.getDeclaredField("s");
            field1.setAccessible(true);
            field1.set(obj, "Java");

            Method methodCall2 = classObj.getDeclaredMethod("method1");
            methodCall2.invoke(obj);

            Method methodCall3 = classObj.getDeclaredMethod("method3");
            methodCall3.setAccessible(true);
            methodCall3.invoke(obj);

//            Test obj = new Test();
//            Class cls = obj.getClass();
//            System.out.println("The name of the class is: "+ cls.getName());
//
//            Constructor constructor = cls.getConstructor();
//            System.out.println("The name of the constructor is: " + constructor.getName());
//
//            Method[] methods = cls.getMethods();
//            for(Method method : methods) {
//                System.out.println(method.getName());
//            }
//
//            Method methodCall1 = cls.getDeclaredMethod("method2", int.class);
//            methodCall1.invoke(obj,19);
//            Field field1 = cls.getDeclaredField("s");
//            field1.setAccessible(true);
//            field1.set(obj, "Java");
//
//            Method methodCall2 = cls.getDeclaredMethod("method1");
//            methodCall2.invoke(obj);
//            Method methodCall3 = cls.getDeclaredMethod("method3");
//            methodCall3.setAccessible(true);
//            methodCall3.invoke(obj);



//            // Creating object whose property is to be checked
//            Test obj = new Test();
//
//            // Creating class object from the object using
//            // getclass method
//            Class cls = obj.getClass();
//            System.out.println("The name of class is " +
//                    cls.getName());
//
//            // Getting the constructor of the class through the
//            // object of the class
//            Constructor constructor = cls.getConstructor();
//            System.out.println("The name of constructor is " +
//                    constructor.getName());
//
//            System.out.println("The public methods of class are : ");
//
//            // Getting methods of the class through the object
//            // of the class by using getMethods
//            Method[] methods = cls.getMethods();
//
//            // Printing method names
//            for (Method method : methods)
//                System.out.println(method.getName());
//
//            // creates object of desired method by providing the
//            // method name and parameter class as arguments to
//            // the getDeclaredMethod
//            Method methodcall1 = cls.getDeclaredMethod("method2",
//                    int.class);
//
//            // invokes the method at runtime
//            methodcall1.invoke(obj, 19);
//
//            // creates object of the desired field by providing
//            // the name of field as argument to the
//            // getDeclaredField method
//            Field field = cls.getDeclaredField("s");
//
//            // allows the object to access the field irrespective
//            // of the access specifier used with the field
//            field.setAccessible(true);
//
//            // takes object and the new value to be assigned
//            // to the field as arguments
//            field.set(obj, "JAVA");
//
//            // Creates object of desired method by providing the
//            // method name as argument to the getDeclaredMethod
//            Method methodcall2 = cls.getDeclaredMethod("method1");
//
//            // invokes the method at runtime
//            methodcall2.invoke(obj);
//
//            // Creates object of the desired method by providing
//            // the name of method as argument to the
//            // getDeclaredMethod method
//            Method methodcall3 = cls.getDeclaredMethod("method3");
//
//            // allows the object to access the method irrespective
//            // of the access specifier used with the method
//            methodcall3.setAccessible(true);
//
//            // invokes the method at runtime
//            methodcall3.invoke(obj);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
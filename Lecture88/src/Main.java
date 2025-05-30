import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        try{
            Class aObject = Class.forName("Dog");

            Dog d1 = new Dog();
            Class objectB = d1.getClass();

            Class cObject = Dog.class;

            String name = objectB.getName();
            System.out.println("CLass name: " + cObject.getName());

            int modifier = objectB.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + modifier);


            Class superClass = objectB.getSuperclass();
            System.out.println("Parent class: " + superClass.getName());

            Method[] methods = objectB.getDeclaredMethods();
            for(Method method : methods) {

                System.out.println("Method name: " + method.getName());

                int modifier1 = method.getModifiers();
                String mod1 = Modifier.toString(modifier1);
                System.out.println("Method modifier: " + mod1);

                System.out.println("Return type: " + method.getReturnType());

            }

            Field field1 = objectB.getField("type");
            field1.set(d1, "Labrador");

            String typeValue = (String) field1.get(d1);
            System.out.println("Value: " + typeValue);

            int modifier12 = field1.getModifiers();
            System.out.println("MOdifier: " + Modifier.toString(modifier12));


            Field field2 = objectB.getDeclaredField("color");
            field2.setAccessible(true);
            field2.set(d1, "brown");

            Constructor[] constructors = objectB.getDeclaredConstructors();

            for(Constructor constructor : constructors) {
                System.out.println("COnstructor name: " + constructor.getName());
                int modCon = constructor.getModifiers();
                System.out.println("ModifierCon: " + Modifier.toString(modCon));
                System.out.println("PArameters: " + constructor.getParameterCount());
            }

        }catch (Exception e){
            System.out.println(e);
        }

//        try {
//            Class aObject = Class.forName("Dog");
//
//            Dog d1 = new Dog();
//            Class bObject = d1.getClass();
//
//            Class cObject = Dog.class;
//
//
//            String name = bObject.getName();
//            System.out.println("Name: " + name);
//
//            int modifier = bObject.getModifiers();
//
//            String mod = Modifier.toString(modifier);
//            System.out.println("Modifier: " + mod);
//
//            Class superClass = bObject.getSuperclass();
//            System.out.println("Super class: " + superClass);
//
//            Method[] methods = bObject.getDeclaredMethods();
//            for (Method m : methods) {
//                System.out.println("Method name: " + m.getName());
//
//                int modifier1 = m.getModifiers();
//                System.out.println("Modifier: " + Modifier.toString(modifier1));
//
//                System.out.println("Return types:" + m.getReturnType());
//                System.out.println(" ");
//            }
//
//            Field fiel1 = bObject.getField("type");
//            fiel1.set(d1, "labrador");
//
//            String typeValue = (String) fiel1.get(d1);
//            System.out.println("Value: " + typeValue);
//
//            int mod11 = fiel1.getModifiers();
//
//            String modifier11 = Modifier.toString(mod11);
//            System.out.println("Modifier: " + modifier11);
//            System.out.println(" ");
//
//            Field field2 = bObject.getDeclaredField("color");
//            field2.setAccessible(true);
//
//            field2.set(d1, "brown");
//
//
//            Constructor[] constructors = bObject.getDeclaredConstructors();
//
//            for(Constructor c : constructors) {
//                System.out.println("Constructor name: " + c.getName());
//
//                int modifier111 = c.getModifiers();
//                String mod111 = Modifier.toString(modifier111);
//                System.out.println("Modifier: " + mod111);
//
//                System.out.println("Parameters: " + c.getParameterCount());
//                System.out.println(" ");
//            }
//
//        } catch (Exception e){}
    }
}
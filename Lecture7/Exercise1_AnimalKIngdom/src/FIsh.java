public class FIsh implements Animal{

    @Override
    public void sleep(){
        System.out.println("THe fish rests deep in the water");
    }

    @Override
    public void move(){
        System.out.println("The fish swims in the sea");
    }

    @Override
    public void sound(){
        System.out.println("FIsh bubbling!");
    }
}

public class Fish implements Animal{
    @Override
    public void sound(){
        System.out.println("Fish bubbling");
    }

    @Override
    public void move(){
        System.out.println("Fish swims in the sea");
    }

    @Override
    public void sleep(){
        System.out.println("Fish sleeps in the sea");
    }

}

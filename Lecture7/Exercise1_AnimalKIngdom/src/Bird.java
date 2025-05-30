public class Bird implements Animal{
    @Override
    public void sleep(){
        System.out.println("THe bird sleeps on branch");
    }

    @Override
    public void move(){
        System.out.println("Bird flies in the sky");
    }

    @Override
    public void sound(){
        System.out.println("BIrd sings !");
    }
}

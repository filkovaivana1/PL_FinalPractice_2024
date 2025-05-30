public class Bird implements Animal{
    @Override
    public void sound(){
        System.out.println("Bird sings");
    }

    @Override
    public void move(){
        System.out.println("Bird flies high in the sky");
    }

    @Override
    public void sleep(){
        System.out.println("BIrd sleeps on a branch");
    }
}

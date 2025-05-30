public class Lion implements Animal{

    @Override
    public void sleep(){
        System.out.println("THe lion sleeps");
    }

    @Override
    public void move(){
        System.out.println("Lion moves gracefully in the savannah");
    }

    @Override
    public void sound(){
        System.out.println("Loin roars!");
    }

}

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void onomatopoeia() {
        System.out.println(super.getName() + " says woof!");
    }
}

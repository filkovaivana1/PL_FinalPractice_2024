public class Movie extends Media{
    private double duration;

    public Movie(String title, String creator, double duration) {
        super(title, creator);
        this.duration = duration;
    }

    public void watchTrailer() {
        System.out.println("We can watch the movie");
    }

    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println("Duration: " + duration);
    }
}

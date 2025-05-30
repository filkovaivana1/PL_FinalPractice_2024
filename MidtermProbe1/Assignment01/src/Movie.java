public class Movie extends Media{
    double duration;

    public Movie(String title, String creator, double duration) {
        super(title, creator);
        this.duration = duration;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Duration of the movie: " + duration);
    }
    public void watchTrailer(){
        System.out.println("The trailer can be accessed");
    }
}

public class Media {
    String title;
    String creator;

    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
    }
}

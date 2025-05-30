public class Library {

    public static void displayAllMedia(Media[] mediaList){

        for (Media media : mediaList) {
            media.displayInfo();

            if(media instanceof BookMedia) {
                ((BookMedia) media).readSample();
            } else if(media instanceof Movie) {
                ((Movie) media).watchTrailer();
            }
        }


    }
}

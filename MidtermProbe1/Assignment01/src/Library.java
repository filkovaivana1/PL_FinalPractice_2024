public class Library {
    public void displayAllInfo(Media[] media_list){
        for(Media m : media_list){
            System.out.println();
            m.displayInfo();
            if (m instanceof Book){
                ((Book) m).readSample();
            } else if (m instanceof Movie) {
                ((Movie) m).watchTrailer();
            }
        }

    }
}

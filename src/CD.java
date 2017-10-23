public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int publishingYear;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }

    //    CD's parameter contains its artist (String), title (String), and publishing year (int).
//    All CDs weigh 0.1 kg.

//    implement ToBeStored interface
//    why we need @override annotation? --> to prevent making mistakes such as wrong method name
}

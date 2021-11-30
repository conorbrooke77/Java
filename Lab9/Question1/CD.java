package Lab9.Question1;

public class CD extends LibraryItem implements LoanItem{
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String ID, String band, String title, int numTracks) {
        super(type, ID);
        //TODO Auto-generated constructor stub
        setTitle(title);
        setBand(band);
        setNumTracks(numTracks);
    }


    public void setBand(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNumTracks(int numTracks) {
        
        this.numTracks = numTracks;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public String toString() {
        return super.toString() + "\nBand :" + band + "\nTitle: " + title + "\nNumber Of Tracks: " + numTracks;
    }


    @Override
    public double calculatePrice(int totalDaysToLoan) {
        // TODO Auto-generated method stub
        double reduction = 10; // If a user loans the LibraryItem for less than or equal to ten days there is none loan amount;
        double totalPrice =0;

        if (totalDaysToLoan >= reduction) {
            reduction = totalDaysToLoan - reduction;
            totalPrice = reduction * 1.3;
        }

        return totalPrice;
    }
}

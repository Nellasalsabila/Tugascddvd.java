public class Cd extends Product {
    String Artist;
    int numSong;
    String label;

    public Cd(){
        super();//mengakses Constructor SuperClass
        Artist ="";
        numSong = 0;
        label ="";
    }

    //Constructor parameter
    public Cd(int number, String nama, int Quantity, double price, String Artist, int numSong, String label) {
        super(number, nama, Quantity, price );
        this.Artist = Artist;
        this.numSong = numSong;
        this.label = label;
    }
    
    public String getArtist() {
        return this.Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    }

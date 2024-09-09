//Subclass
public class DVD extends Product {
    int Length;
    String rating;
    String studio;
    
    public DVD(){
        super();
        Length = 0;
        rating = "";
        studio ="";
    }
        //Constructor Parameter
    public DVD(int number, String nama, int Quantity,double price, int Length, String rating, String Studio){
        super(number, nama, Quantity, price);
        this.Length=Length;
        this.rating=rating;
        this.studio=studio;
    }
    public int getLength() {
        return this.Length=Length;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public String getRating() {
        return this.rating;
    }

    public String setRating(String rating) {
        return this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

}

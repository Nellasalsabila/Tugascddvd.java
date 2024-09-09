public class Product {
    static int number;
    static String nama;
    static int Quantity;
    static double price;

    public Product() {
        number = 0;
        nama ="";
        Quantity= 0;
        price = 0; 
    }

    public Product(int number, String nama, int Quantity, double price) {
        this.number = number;
        this.nama = nama;
        this.Quantity = Quantity;
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

 }

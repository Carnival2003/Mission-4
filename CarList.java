import java.util.GregorianCalendar;

public class CarList {

    private int id;
    private String marka;
    private String model;
    private GregorianCalendar year;
    private String color;
    private int price;
	private String phone;

    //конструктор
    public CarList(int id, String marka, String model, GregorianCalendar year, String color,
                   int price, String phone) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.phone = phone;
    }

    // сеттеры и геттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public GregorianCalendar getYear() {
        return year;
    }

    public void setYear(GregorianCalendar year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
	
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
public class PatientList {

    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private String adress;
    private String phone;
	private String diag;
    private int groupNumber;

    //конструктор
    public PatientList(int id, String name, String patronymic, String surname, GregorianCalendar birthdate, String adress,
                   String phone, String diag, int groupNumber) {
        this.id = id;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.birthdate = birthdate;
        this.adress = adress;
        this.phone = phone;
		this.diag = diag;
        this.groupNumber = groupNumber;
    }

    // сеттеры и геттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
	
    public String getDiag() {
        return diag;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }
	
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}

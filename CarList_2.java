import java.util.Calendar;
import java.util.GregorianCalendar;

public class CarList_2 {

	private CarList_2[] carlist = new CarList_2[100];

	int k = 0; // счетчик

	// добавление

	public void addCarList_2(CarList_2 n) {

		carlist[k++] = n;

	}

	// вывод введенных

	public void listOut(CarList_2[] carlist) {

		for (CarList_2 m : carlist) {

			System.out.print("Номер автомобиля: " + m.getId() + ", ");
			System.out.print("Марка: " + m.getMarka() + ", ");
			System.out.print("Модель: " + m.getModel() + ", ");
			System.out.print("Год выпуска: " + m.getYear().get(Calendar.YEAR) + ", ");
			System.out.print("Цвет: " + m.getColor() + ", ");
			System.out.print("Цена: " + m.getPrice() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.println();
		}

	}

	// Автомобили заданной марки;

	public void listOutByMarka(String marka) {

		for (CarList_2 m : carlist) {
			if (m != null) {

				if (marka.equalsIgnoreCase(m.getMarka())) {

			System.out.print("Номер автомобиля: " + m.getId() + ", ");
			System.out.print("Марка: " + m.getMarka() + ", ");
			System.out.print("Модель: " + m.getModel() + ", ");
			System.out.print("Год выпуска: " + m.getYear().get(Calendar.YEAR) + ", ");
			System.out.print("Цвет: " + m.getColor() + ", ");
			System.out.print("Цена: " + m.getPrice() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.println();

				}
			}

		}

	}

	// b) Автомобили заданной марки и больше заданного года;

	public void listOutByMarkaAndYear(String Marka, GregorianCalendar year) {

		for (CarList_2 m : carlist) {
			if (m != null) {
				if (m.getMarka().equalsIgnoreCase(Marka) && m.getYear().get(Calendar.YEAR) > year.get(Calendar.YEAR)) {

			System.out.print("Номер автомобиля: " + m.getId() + ", ");
			System.out.print("Марка: " + m.getMarka() + ", ");
			System.out.print("Модель: " + m.getModel() + ", ");
			System.out.print("Год выпуска: " + m.getYear().get(Calendar.YEAR) + ", ");
			System.out.print("Цвет: " + m.getColor() + ", ");
			System.out.print("Цена: " + m.getPrice() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.println();

				}
			}
		}
	}

	// c) Автомобили заданного года выпуска и цены больше указанной;
	public void listOutByYearandPrice(GregorianCalendar year, int price) {

		for (CarList_2 m : carlist) {
			if (m != null) {
				if (m.getYear().get(Calendar.YEAR).equalsIgnoreCase(Year.get(Calendar.YEAR))&& m.getPrice() > m.getPrice().equalsIgnoreCase(Price) ) {

			System.out.print("Номер автомобиля: " + m.getId() + ", ");
			System.out.print("Марка: " + m.getMarka() + ", ");
			System.out.print("Модель: " + m.getModel() + ", ");
			System.out.print("Год выпуска: " + m.getYear().get(Calendar.YEAR) + ", ");
			System.out.print("Цвет: " + m.getColor() + ", ");
			System.out.print("Цена: " + m.getPrice() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.println();

				}
			}
		}

	}

}
import java.util.Scanner;

public class StudentList_2 {

	private Patient[] patientlist = new Patient[100];

	int k = 0; // счетчик
    int a;
	int b;
	
	
	// добавление

	public void addPatient(Patient n) {

		patientlist[k++] = n;

	}

	// вывод введенных

	public void listOut(Patient[] patientlist) {

		for (Patient m : patientlist) {

			System.out.print("Номер пациента: " + m.getId() + ", ");
			System.out.print("Имя: " + m.getName() + ", ");
			System.out.print("Фамилия: " + m.getPatronymic() + ", ");
			System.out.print("Отчество: " + m.getSurname() + ", ");
			System.out.print("Адрес: " + m.getAdress() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.print("Диагноз: " + m.getDiag() + ", ");
			System.out.print("Номер медицинской карты: " + m.getGroupNumber() + ", ");
			System.out.println();
		}

	}

	// список пациентов имеющих данный диагноз;

	public void listOutByDiag(String diag) {

		for (Patient m : patientlist) {
			if (m != null) {

				if (diag.equalsIgnoreCase(m.getDiag())) {

			System.out.print("Номер пациента: " + m.getId() + ", ");
			System.out.print("Имя: " + m.getName() + ", ");
			System.out.print("Фамилия: " + m.getPatronymic() + ", ");
			System.out.print("Отчество: " + m.getSurname() + ", ");
			System.out.print("Адрес: " + m.getAdress() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.print("Диагноз: " + m.getDiag() + ", ");
			System.out.print("Номер медицинской карты: " + m.getGroupNumber() + ", ");
			System.out.println();

				}
			}

		}

	}

	// b) список пациентов у которых номер медицинской карты находится в заданном интревале;

	public void listOutByGroup(int groupe) {

		for (Patient m : patientlist) {
			if (m != null) {
				Scanner get = new Scanner(System.in);
				System.out.println("Введите интервал медицинских карт от "a" до "b": ");
				int a = get.nextInt();
				int b = get.nextInt();
				if (a < m.getGroupNumber() && b > m.getGroupNumber()) {

			System.out.print("Номер пациента: " + m.getId() + ", ");
			System.out.print("Имя: " + m.getName() + ", ");
			System.out.print("Фамилия: " + m.getPatronymic() + ", ");
			System.out.print("Отчество: " + m.getSurname() + ", ");
			System.out.print("Адрес: " + m.getAdress() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.print("Диагноз: " + m.getDiag() + ", ");
			System.out.print("Номер медицинской карты: " + m.getGroupNumber() + ", ");
			System.out.println();

				}
			}
		}
	}

}

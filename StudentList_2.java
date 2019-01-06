import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentList_2 {

	private Student[] studentlist = new Student[100];

	int k = 0; // счетчик

	// добавление

	public void addStudent(Student n) {

		studentlist[k++] = n;

	}

	// вывод введенных

	public void listOut(Student[] studentlist) {

		for (Student m : studentlist) {

			System.out.print("Номер студента: " + m.getId() + ", ");
			System.out.print("Имя: " + m.getName() + ", ");
			System.out.print("Фамилия: " + m.getPatronymic() + ", ");
			System.out.print("Отчество: " + m.getSurname() + ", ");
			System.out.print("Дата рождения: " + m.getBirthdate().get(Calendar.YEAR) + "-"
					+ m.getBirthdate().get(Calendar.MONTH) + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
			System.out.print("Адрес: " + m.getAdress() + ", ");
			System.out.print("Телефон: " + m.getPhone() + ", ");
			System.out.print("Факультет: " + m.getFaculty() + ", ");
			System.out.print("Курс: " + m.getCourseNumber() + ", ");
			System.out.print("Номер группы: " + m.getGroupNumber() + ", ");
			System.out.println();
		}

	}

	// список студентов заданного факультета;

	public void listOutByFaculty(String faculty) {

		for (Student m : studentlist) {
			if (m != null) {

				if (faculty.equalsIgnoreCase(m.getFaculty())) {

					System.out.print("Номер студента: " + m.getId() + ", ");
					System.out.print("Имя: " + m.getName() + ", ");
					System.out.print("Фамилия: " + m.getPatronymic() + ", ");
					System.out.print("Отчество: " + m.getSurname() + ", ");
					System.out.print("Дата рождения: " + m.getBirthdate().get(Calendar.YEAR) + "-"
							+ m.getBirthdate().get(Calendar.MONTH) + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH)
							+ ", ");
					System.out.print("Адрес: " + m.getAdress() + ", ");
					System.out.print("Телефон: " + m.getPhone() + ", ");
					System.out.print("Факультет: " + m.getFaculty() + ", ");
					System.out.print("Курс: " + m.getCourseNumber() + ", ");
					System.out.print("Номер группы: " + m.getGroupNumber() + ", ");
					System.out.println();

				}
			}

		}

	}

	// b) списки студентов для каждого факультета и курса;

	public void listOutByFacultyAndCourse(String Faculty, int course) {

		for (Student m : studentlist) {
			if (m != null) {
				if (m.getFaculty().equalsIgnoreCase(Faculty) && m.getCourseNumber() == course) {

					System.out.print("Номер студента: " + m.getId() + ", ");
					System.out.print("Имя: " + m.getName() + ", ");
					System.out.print("Фамилия: " + m.getPatronymic() + ", ");
					System.out.print("Отчество: " + m.getSurname() + ", ");
					System.out.print("Дата рождения: " + m.getBirthdate().get(Calendar.YEAR) + "-"
							+ m.getBirthdate().get(Calendar.MONTH) + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH)
							+ ", ");
					System.out.print("Адрес: " + m.getAdress() + ", ");
					System.out.print("Телефон: " + m.getPhone() + ", ");
					System.out.print("Факультет: " + m.getFaculty() + ", ");
					System.out.print("Курс: " + m.getCourseNumber() + ", ");
					System.out.print("Номер группы: " + m.getGroupNumber() + ", ");
					System.out.println();

				}
			}
		}
	}

	// c) список студентов, родившихся после заданного года;
	public void listOutByYear(GregorianCalendar year) {

		for (Student m : studentlist) {
			if (m != null) {
				if (m.getBirthdate().get(Calendar.YEAR) > year.get(Calendar.YEAR)) {

					System.out.print("Номер студента: " + m.getId() + ", ");
					System.out.print("Имя: " + m.getName() + ", ");
					System.out.print("Фамилия: " + m.getPatronymic() + ", ");
					System.out.print("Отчество: " + m.getSurname() + ", ");
					System.out.print("Дата рождения: " + m.getBirthdate().get(Calendar.YEAR) + "-"
							+ m.getBirthdate().get(Calendar.MONTH) + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH)
							+ ", ");
					System.out.print("Адрес: " + m.getAdress() + ", ");
					System.out.print("Телефон: " + m.getPhone() + ", ");
					System.out.print("Факультет: " + m.getFaculty() + ", ");
					System.out.print("Курс: " + m.getCourseNumber() + ", ");
					System.out.print("Номер группы: " + m.getGroupNumber() + ", ");
					System.out.println();

				}
			}
		}

	}

	public void listOutByGroup(int groupe) {

		for (Student m : studentlist) {
			if (m != null) {
				if (m.getGroupNumber() == groupe) {

					System.out.print("Номер студента: " + m.getId() + ", ");
					System.out.print("Имя: " + m.getName() + ", ");
					System.out.print("Фамилия: " + m.getPatronymic() + ", ");
					System.out.print("Отчество: " + m.getSurname() + ", ");
					System.out.print("Дата рождения: " + m.getBirthdate().get(Calendar.YEAR) + "-"
							+ m.getBirthdate().get(Calendar.MONTH) + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH)
							+ ", ");
					System.out.print("Адрес: " + m.getAdress() + ", ");
					System.out.print("Телефон: " + m.getPhone() + ", ");
					System.out.print("Факультет: " + m.getFaculty() + ", ");
					System.out.print("Курс: " + m.getCourseNumber() + ", ");
					System.out.print("Номер группы: " + m.getGroupNumber() + ", ");
					System.out.println();

				}
			}
		}
	}

}

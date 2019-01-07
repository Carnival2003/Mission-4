public class PatientRunner {

    public static void main(String[] args) {


        Patient[] pati = new Patient[3];
        pati[0] = new Patient(1, "Дмитрий", "Кореньков", "Вячеславович", "Боровляны", "25-822-24-87", "Идиот", 10);
        pati[1] = new Patient(2, "Андрей", "Шевелев", "Игоревич", "Вилейка", "33-620-00-19", "Дурак", 50);
        pati[2] = new Patient(3, "Кирилл", "Михейчик", "Анатольевич", "Жодино", "29-969-96-63", "Дурак", 100);
        //создаем список
        List l = new List();

        //добавляем в список
        for (Patient k : pati) {
            l.addPatient(k);
        }
     
        System.out.println(" ");
        System.out.println("Список выведенных пациентов: ");
        l.listOut(pati);
     
        System.out.println(" ");
        System.out.println("Список пациентов с данным диагнозом: ");
        l.listOutByDiag("Дурак");
        
        System.out.println(" ");
        System.out.println("Список пацинтов номер медицинской карты находится в заданном промежутке: ");
        l.listOutByGroup(50);
       

    }

}

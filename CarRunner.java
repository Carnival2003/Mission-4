public class CarRunner {

    public static void main(String[] args) {

/* Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
Создать массив объектов. Вывести:
a) список автомобилей заданной марки;
b) список автомобилей заданной модели, которые эксплуатируются боль-
ше n лет;
c) список автомобилей заданного года выпуска, цена которых больше ука-
занной.
 */
        // Добавляем автомобили;
        Car[] car = new Car[3];
        car[0] = new Car(1, "Peugeot", "5008", new GregorianCalendar(2010), "Серый", 10500, "6460 KI-5");
        car[1] = new Car(2, "Fiat", "Ulysse", new GregorianCalendar(2003), "Синий", 5300, "5320 ВЕ-5");
        car[2] = new Car(3, "Geely", "Atlas", new GregorianCalendar(2018), "Белый", 15000, "4748 MC-5");
       
	   //создаем список
       
	   List l = new List();

       	   //добавляем в список
		   
        for (CarList_2 k : carlist) {
            l.addCarList_2(k);
        }
        //выводим список автомобилей;
        System.out.println(" ");
        System.out.println("Список автомобилей: ");
        l.listOut(car);
        //a) Автомобили заданной марки;
        System.out.println(" ");
        System.out.println("Автомобили заданной марки: ");
        l.listOutByMarka("Fiat");
        //b) Автомобили заданной марки и больше заданного года;
        System.out.println(" ");
        System.out.println("Автомобили заданной марки и больше заданного года: ");
        l.listOutByMarkaAndYear("Geely", 2000);
        //c) Автомобили заданного года выпуска и цены больше указанной;
        System.out.println(" ");
        System.out.println("Автомобили заданного года выпуска и цены больше указанной: ");
        l.listOutByYearandPrice(new GregorianCalendar(2003), 4000);

    }

}
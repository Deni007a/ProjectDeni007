package OOP.Them2.Laba3;

/**
 лаба 3
 Напишите класс Employee с calcSalary метод с аргументом name(String)
 и varargs salary(double...). Этот метод должен рассчитать общий оклад работника и напечатать его имя и общей заработной платы.

 */
public class Employee {

    void calcSalaty(String name, double... salary) {
        double symma = 0;
        System.out.println(name);
        System.out.println("что выведет вместо salary: "+salary);
        for (double a : salary) {
            symma += a;
        }
        System.out.println("Сумма зарплаты " + symma);
    }


    public static void main(String[] args) {

 Employee emp = new Employee();
        emp.calcSalaty("Вася",10,20,30);




}}


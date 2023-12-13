public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kirill", "Bernatskyi");
        System.out.println(person.info());

        Employee employee = new Employee("Oleg","Kosov", 2300);
        System.out.println(employee.info());
    }
}

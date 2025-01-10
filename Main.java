import java.util.*;
interface Payable {
    double getPaymentAmount();
}
class MyApplication {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Engineer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.9));
        printData(people);
    }
    public static void printData(Iterable<Payable> payables) {
        for (Payable p : payables) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}

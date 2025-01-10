public class Person implements Payable, Comparable<Person> {
    protected String Name;
    protected String Surname;
    private static int id = 1;
    protected final int id_gen;

    public Person(String Name, String Surname) {
        this();
        this.Name = Name;
        this.Surname = Surname;
    }
    public Person() {
        this.id_gen = id++;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getSurname() {
        return Surname;
    }
    public void setSurname(String surname) {
        this.Surname = surname;
    }
    public String getPosition() {
        return "Student";
    }
    public double getPaymentAmount() {
        return 0;
    }
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
    public String toString() {
        return id_gen + ". " + Name + " " + Surname;
    }
}
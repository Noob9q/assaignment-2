public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
    }
    public Employee(String Name,String Surname,String position,double salary) {
        super(Name,Surname);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Employee:" +  super.toString();
    }
    public double getPaymentAmount(){
        return salary;
    }
}


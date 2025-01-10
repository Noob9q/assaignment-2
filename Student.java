public class Student extends Person {
    private double gpa;
    private static final double Scholarship=36660.00;
    public Student(String Name, String Surname, double gpa) {
        super(Name,Surname);
        this.gpa = gpa;
    }
    public Student(){
        super();
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void getGpa(double gpa){
        this.gpa = gpa;
    }
    public double getPaymentAmount(){
        return gpa>2.67 ? Scholarship : 0;
    }
    public String toString() {
        return "Student:" +  super.toString();
    }
}

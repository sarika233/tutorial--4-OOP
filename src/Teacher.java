
public class Teacher extends Person {

    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender,
                   String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private Student[] tutees = new Student[3];

    public void setTutee(int index, Student student) {
        tutees[index] = student;
    }

    public Student getTutee(int index) {
        return tutees[index];
    }

    @Override
    public String toString() {
        return super.toString()
                + ", subject: " + subject
                + ", salary: " + salary;
    }
}


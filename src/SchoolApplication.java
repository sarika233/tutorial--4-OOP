
public class SchoolApplication {

    public static void main(String[] args) {

        Person jack = new Person("Jack Brooke", 27, "M");
        System.out.println(jack);

        Student beth = new Student("Elisabeth Smith", 16, "F", "122233");
        System.out.println(beth);

        Teacher sam = new Teacher(
                "Sam Hamilton", 34, "M", "Computer Science", 50000
        );
        System.out.println(sam);

        Person p = new Teacher(
                "Sam Hamilton", 34, "M", "Computer Science", 50000
        );

        Person s = new Student(
                "Elisabeth Smith", 16, "F", "122233"
        );

        System.out.println(p);
        System.out.println(s);

        Student student1 =
                new Student("Alice", 18, "F", "1001");

        Student student2 =
                new Student("Bob", 19, "M", "1002");

        Student student3 =
                new Student("Charlie", 18, "M", "1003");

        Teacher teacher =
                new Teacher("Sam Hamilton", 34, "M",
                        "Computer Science", 50000);

        teacher.setTutee(0, student1);
        teacher.setTutee(1, student2);
        teacher.setTutee(2, student3);

        System.out.println("Teacher: " + teacher.getName());

        for (int i = 0; i < 3; i++) {
            System.out.println(teacher.getTutee(i));
        }
    }
}

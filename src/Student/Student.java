package Student;

public class Student {

    String name;
    String hobby;
    String sportActivity;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{hobby='" + this.hobby + "', name='" + this.name + "', sportActivity='" + this.sportActivity + "'}";
    }
}

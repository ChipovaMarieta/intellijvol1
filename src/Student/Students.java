package Student;

import java.util.Arrays;

public class Students {

    Student[] students = new Student[6];
    int studentsAfterMorningCheckUp;
    String schoolActivityGroup;
    int studentsInClass;

    public Students() {
    }

    public void addStudentToGroup(Student newStudent) {
        for(int i = 0; i < this.students.length; ++i) {
            if (this.students[i] == null) {
                this.students[i] = newStudent;
                System.out.println("Student" + newStudent.name + " is added. ");
                return;
            }
        }

    }

    public String toString() {
        String var10000 = this.schoolActivityGroup;
        return "Students{schoolActivityGroup='" + var10000 + "', students=" + Arrays.toString(this.students) + ", studentsAfterMorningCheckUp=" + this.studentsAfterMorningCheckUp + ", studentsInClass=" + this.studentsInClass + "}";
    }
}

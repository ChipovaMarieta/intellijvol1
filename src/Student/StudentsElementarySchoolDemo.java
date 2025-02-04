package Student;

import java.util.Arrays;

public class StudentsElementarySchoolDemo {

    public static void main(String[] args) {
        Student student1 = new Student("Group 4 - Petyr");
        Student student2 = new Student("Group 4 - Katq");
        Student student3 = new Student("Group 4 - Ivan");
        Student student4 = new Student("Group 4 - Anna");
        Student student5 = new Student("Group 4 - Irina");
        Student student6 = new Student("Group 4 - Zara");
        Students studentsGroup4 = new Students();
        studentsGroup4.addStudentToGroup(student1);
        studentsGroup4.addStudentToGroup(student2);
        studentsGroup4.addStudentToGroup(student3);
        studentsGroup4.addStudentToGroup(student4);
        studentsGroup4.addStudentToGroup(student5);
        studentsGroup4.addStudentToGroup(student6);
        System.out.println(studentsGroup4);
        Student[] students1 = new Student[6];
        students1.equals(studentsGroup4);

        for(int i = 0; i < studentsGroup4.students.length; ++i) {
            if (studentsGroup4.students[i] != null) {
                students1[i] = new Student(studentsGroup4.students[i].name);
            }
        }

        System.out.println("Printng students1 array:");
        System.out.println(Arrays.toString(students1));
        Student[] studentsExtended = (Student[])Arrays.copyOf(students1, students1.length + 2);
        System.out.println("Printing new extended array: ");
        System.out.println(Arrays.toString(studentsExtended));
        String name = student1.name;

        for(int i = 0; i < studentsGroup4.students.length; ++i) {
            if (studentsGroup4.students[i] != null) {
                System.out.println(studentsGroup4.students[i].name.substring(10));
            }
        }

    }
}

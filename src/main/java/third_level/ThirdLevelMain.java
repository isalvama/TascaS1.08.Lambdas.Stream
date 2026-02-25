package third_level;

import java.util.Arrays;
import java.util.List;

public class ThirdLevelMain {
    public static void main (String[] args){
        Student student1 = new Student("Joe", 30, "PHP", 6.5);
        Student student2 = new Student("Laura", 35, "Java", 7);
        Student student3 = new Student("Mark", 27, "Javascript", 4);
        Student student4 = new Student("Albert", 25, "Javascript", 3);
        Student student5 = new Student("Alex", 30, "PHP", 5);
        Student student6 = new Student("Valerie", 23, "Java", 9);
        Student student7 = new Student("Fernando", 32, "Javascript", 6.5);
        Student student8 = new Student("Ivan", 31, "Java", 4.5);
        Student student9 = new Student("Aura", 26, "PHP", 6);
        Student student10 = new Student("Natalia", 30, "Java", 9);

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);

        StudentAnalyzer analyzer = new StudentAnalyzer(studentList);
        System.out.println("Result of printStudentNameAndAge method: ");
        analyzer.printStudentNameAndAge();
        System.out.println("Result of addStudentWithInitialNameList method: ");
        analyzer.addStudentWithInitialNameList();
        System.out.println("Result of printStudentsWithMinGrade method: ");
        analyzer.printStudentsWithMinGrade();
        System.out.println("Result of printStudentsWithMinGradeNotPHP method: ");
        analyzer.printStudentsWithMinGradeNotPHP();
        System.out.println("Result of printAdultJavaStudents method: ");
        analyzer.printAdultJavaStudents();
    }
}

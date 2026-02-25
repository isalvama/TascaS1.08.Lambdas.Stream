package third_level;
import java.util.ArrayList;
import java.util.List;


public class StudentAnalyzer {
    private List<Student> studentList;
    private List<Student> studentWithInitialNameList;
    private static final char CHAR_TO_FILTER = 'a';
    private static final int MIN_GRADE = 5;
    private static final String NAME_COURSE_JAVA = "java";
    private static final String NAME_COURSE_PHP = "php";
    private static final int ADULT_MIN_AGE = 18;

    public StudentAnalyzer(List<Student> studentList){
        this.studentList = studentList;
        this.studentWithInitialNameList = new ArrayList<>();
    }

    public void printStudentNameAndAge(){
        this.studentList.forEach(sd -> System.out.println("name: " + sd.getName() + ", age: " + sd.getAge()));
    }

    public void addStudentWithInitialNameList(){
        this.studentList.stream().filter(
                sd -> sd.getName().toLowerCase().charAt(0) == CHAR_TO_FILTER).
                forEach(sd -> studentWithInitialNameList.add(sd));
        studentWithInitialNameList.forEach(System.out::println);
    }

    public void printStudentsWithMinGrade(){
        this.studentList.stream().filter(
                        sd -> sd.getGrade() >= MIN_GRADE).
                forEach(System.out::println);
    }

    public void printStudentsWithMinGradeNotPHP(){
        this.studentList.stream().filter(
                        sd -> sd.getGrade() >= MIN_GRADE && !sd.getStudyCourse().equalsIgnoreCase(NAME_COURSE_PHP)).
                forEach(System.out::println);
    }

    public void printAdultJavaStudents(){
        this.studentList.stream().filter(
                        sd -> sd.getAge() >= ADULT_MIN_AGE && sd.getStudyCourse().equalsIgnoreCase(NAME_COURSE_JAVA)).
                forEach(System.out::println);
    }
}

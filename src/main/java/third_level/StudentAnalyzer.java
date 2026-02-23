package third_level;
import java.util.ArrayList;
import java.util.List;

/*
Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes a una altra llista i mostra per pantalla la nova llista (tot amb lambdes).
Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o més, i que no són de PHP.
Mostra tots els alumnes que fan JAVA i són majors d’edat.
 */

public class StudentAnalyzer {
    private List<Student> studentList;
    private List<Student> studentWithANameList;

    public StudentAnalyzer(List<Student> studentList){
        this.studentList = studentList;
        this.studentWithANameList = new ArrayList<>();
    }

    public void printStudentNameAndAge(){
        this.studentList.forEach(sd -> System.out.println("name: " + sd.getName() + ", age: " + sd.getAge()));
    }

    public void addStudentWithANameList(){
        this.studentList.stream().filter(
                sd -> sd.getName().toLowerCase().charAt(0) == 'a').
                forEach(sd -> studentWithANameList.add(sd));
        studentWithANameList.forEach(System.out::println);
    }

    public void printStudentWith5OrMoreGrade(){
        this.studentList.stream().filter(
                        sd -> sd.getGrade() >= 5).
                forEach(System.out::println);
    }

    public void printStudentWith5OrMoreGradeNotPHP(){
        this.studentList.stream().filter(
                        sd -> sd.getGrade() >= 5).filter(sd -> !sd.getStudyCourse().equalsIgnoreCase("php")).
                forEach(System.out::println);
    }

    public void printAdultAndJavaStudents(){
        this.studentList.stream().filter(
                        sd -> sd.getGrade() >= 5).filter(sd -> sd.getStudyCourse().equalsIgnoreCase("java")).
                forEach(System.out::println);
    }
}

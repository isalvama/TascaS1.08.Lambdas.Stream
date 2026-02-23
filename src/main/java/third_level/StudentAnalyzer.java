package third_level;
import java.util.List;

public class StudentAnalyzer {
    List<Student> studentList;

    public StudentAnalyzer(List<Student> studentList){
        this.studentList = studentList;
    }

    public void print(){
        this.studentList.forEach(sd -> System.out.println("name: " + sd.getName() + "age: " + sd.getAge()));
    }
}

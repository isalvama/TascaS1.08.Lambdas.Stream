package third_level;
import java.util.List;

public class StudentAnalizer {
    List<Student> studentList;

    public StudentAnalizer (List<Student> studentList){
        this.studentList = studentList;
    }

    public void print(){
        this.studentList.forEach(System.out::println);
    }
}

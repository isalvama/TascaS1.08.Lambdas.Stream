package third_level;

public class Student {
    private String name;
    private int age;
    private String studyCourse;
    private double grade;

    public Student (String name, int age, String studyCourse, double grade){
        this.name = name;
        this.age = age;
        this.studyCourse = studyCourse;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studyCourse='" + studyCourse + '\'' +
                ", grade=" + grade +
                '}';
    }
}

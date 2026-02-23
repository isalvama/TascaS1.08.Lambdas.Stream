package third_level;

import java.util.Arrays;
import java.util.List;

/*
Aquest nivell introdueix l’ús de lambdas i streams aplicats a una classe pròpia, Alumne, per simular situacions reals.
Filtraràs i transformaràs llistes d’objectes, aplicant múltiples condicions i accions. Això t’ajudarà a veure el valor
pràctic d’aquestes eines en projectes més realistes, amb dades més estructurades.

Mostra per pantalla el nom i l’edat de cada alumne/a.
Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes a una altra llista i mostra per pantalla la nova llista (tot amb lambdes).
Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o més, i que no són de PHP.
Mostra tots els alumnes que fan JAVA i són majors d’edat.
 */
public class ThirdLevelMain {
    public static void main (String[] args){
        Student student1 = new Student("Joe", 30, "PHP", 6.5);
        Student student2 = new Student("Laura", 35, "Java", 7);
        Student student3 = new Student("Mark", 27, "Javascript", 8);
        Student student4 = new Student("Maria", 25, "Javascript", 6.5);
        Student student5 = new Student("Alex", 30, "PHP", 5);
        Student student6 = new Student("Valerie", 23, "Java", 9);
        Student student7 = new Student("Fernando", 32, "Javascript", 6.5);
        Student student8 = new Student("Ivan", 31, "Java", 5.5);
        Student student9 = new Student("Paula", 26, "PHP", 6);
        Student student10 = new Student("Natalia", 30, "Java", 9);

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);

        StudentAnalizer analizer = new StudentAnalizer(studentList);
        analizer.print();

    }
}

package org.example.cw2;

import org.example.cw2.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
 * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */
public class Ex2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 2, 237, List.of(6, 4, 5));
        Student student2 = new Student("Машков", 2, 234, List.of(3, 4, 5));
        Student student3 = new Student("Котлова", 2, 234, List.of(3, 4, 5));
        Student student4 = new Student("Михин", 2, 234, List.of(3, 4, 5));
        Student student5 = new Student("Алексеев", 2, 234, List.of(3, 4, 5));

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);

        for (Student el : listStudents) {
            double evaluationSum = 0;
            for (double ev : el.getEvaluations()) {
                evaluationSum += ev;
            }
            if (el.getSurname().endsWith("ова") && evaluationSum % 2 == 0) {
                System.out.println(el.getScholarship());
            }
        }
    }
}

package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Student> firstGradeStudents = new ArrayList<>();
        List<Teacher> firstGradeTeachers = new ArrayList<>();
        Set<Student> teacher1Students = new HashSet<>();
        Set<Student> teacher2Students = new HashSet<>();
        Set<Student> teacher3Students = new HashSet<>();

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 = new Teacher();

        firstGradeTeachers.add(teacher1);
        firstGradeTeachers.add(teacher2);
        firstGradeTeachers.add(teacher3);

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();
        Student student11 = new Student();
        Student student12 = new Student();
        Student student13 = new Student();
        Student student14 = new Student();
        Student student15 = new Student();

        firstGradeStudents.add(student1);
        firstGradeStudents.add(student2);
        firstGradeStudents.add(student3);
        firstGradeStudents.add(student4);
        firstGradeStudents.add(student5);
        firstGradeStudents.add(student6);
        firstGradeStudents.add(student7);
        firstGradeStudents.add(student8);
        firstGradeStudents.add(student9);
        firstGradeStudents.add(student10);
        firstGradeStudents.add(student11);
        firstGradeStudents.add(student12);
        firstGradeStudents.add(student13);
        firstGradeStudents.add(student14);
        firstGradeStudents.add(student15);

        String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10",
                "Name11", "Name12", "Name13", "Name14", "Name15",};

        for (int i = 0; i < firstGradeStudents.size(); i++){
            firstGradeStudents.get(i).setFirstName(names[i]);
            firstGradeStudents.get(i).setId(i);
            firstGradeStudents.get(i).setGrade(1);
        }
        for (int i = 14; i >= 0; i-- ){
            firstGradeStudents.get(i).setLastName(names[i]);
        }

        for (int i = 0; i < firstGradeTeachers.size(); i++){
            firstGradeTeachers.get(i).setFirstName(names[i]);
            firstGradeTeachers.get(i).setId(i);
        }

        for (int i = 2; i >= 0; i--){
            firstGradeTeachers.get(i).setLastName(names[i]);
        }

        for (int i = 0; i < firstGradeStudents.size(); i++){
            if (i < 5){
                teacher1Students.add(firstGradeStudents.get(i));
            }
            else if (i < 10){
                teacher2Students.add(firstGradeStudents.get(i));
            }
            else {
                teacher3Students.add(firstGradeStudents.get(i));
            }
        }
        Map<Teacher, Set> studentsAndTeachers = new HashMap<>();

        studentsAndTeachers.put(teacher1, teacher1Students);
        studentsAndTeachers.put(teacher2, teacher2Students);
        studentsAndTeachers.put(teacher3, teacher3Students);

        Set<Teacher> keyset = studentsAndTeachers.keySet();
        Collection<Set> values = studentsAndTeachers.values();


        for (Teacher teacher : keyset){
            System.out.println(teacher);
        }
        for (Set set : values){
            for (Object student : set){
                System.out.println(student);
            }
        }
    }
}

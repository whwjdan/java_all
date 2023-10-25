package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private int age;
    private String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(50, "봉순"));
        studentList.add(new Student(14, "수수"));
        studentList.add(new Student(17, "아롱"));
        studentList.add(new Student(20, "짱돌"));

        System.out.println("정렬 전 : ");
        for(Student student : studentList){
            System.out.println("나이 : " + student.age + " 이름 : " + student.name);
        }

        // 리턴값이 양수면 앞과 뒤의 순서를 바꾼다.
        // 예를 들어 학생1의 나이가 50, 학생2의 나이가 14이므로 학생1.나이 - 학생2.나이 = 36 >> 양수이므로
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println("-----------------------");
        System.out.println("정렬 후 : ");
        for(Student student : studentList){
            System.out.println("나이 : " + student.age + " 이름 : " + student.name);
        }
    }
}


package day0618.typeparamarray;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));


        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);

        System.out.println("=".repeat(15));
        System.out.println("=".repeat(15));
        System.out.println("=".repeat(15));

//        registerCourseForStudent(personCourse);
//        registerCourseForStudent(workerCourse); //컴파일에러
        registerCourseForStudent(studentCourse);
        registerCourseForStudent(highStudentCourse);

        System.out.println("=".repeat(15));
        System.out.println("=".repeat(15));
        System.out.println("=".repeat(15));


        registerCourseForWorker(personCourse);
        registerCourseForWorker(workerCourse);
//        registerCourseForWorker(studentCourse); //컴파일
//        registerCourseForWorker(highStudentCourse);
    }

    public static void registerCourse(Course<?> course){
        System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseForStudent(Course<? extends Student> course){
        System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseForWorker(Course<? super Worker> course ){
        System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
    }
}

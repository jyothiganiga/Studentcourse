import java.util.ArrayList;
import java.util.List;

class Student {
    @SuppressWarnings("unused")
    private int studentId;
    private String name;
    private String program;
    private String semester;
    private List<Course> courses;

    public Student(int studentId, String name, String program, String semester) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }
public void registerCourse(Course course) {
        courses.add(course);
    }

    // Getters for student information
    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public String getSemester() {
        return semester;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
class Course {
    private String courseCode;
    private String courseName;
    private List<Student> students;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Getters for course information
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }
}
public class Studentcourse {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(101, "Jyothi", "Computer Science", "Spring 2024");
        Student student2 = new Student(102, "Ammu", "Electrical Engineering", "Spring 2024");

        // Create courses
        Course course1 = new Course("CS101", "Introduction to Programming");
        Course course2 = new Course("EE201", "Digital Circuits");

        // Register students for courses
        student1.registerCourse(course1);
        student2.registerCourse(course2);

        // Retrieve student information
        System.out.println(student1.getName() + " (" + student1.getProgram() + ", " + student1.getSemester() + ") is registered for:");
        for (Course course : student1.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }
        System.out.println(student2.getName() + " (" + student2.getProgram() + ", " + student2.getSemester() + ") is registered for:");
        for (Course course : student2.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }
    }
}


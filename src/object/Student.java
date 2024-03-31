package object;

public class Student {
    private String studentName;
    private Integer studentAge;
    private String studentGrade;

    public Student(String studentName, Integer studentAge, String studentGrade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public void displayInformation() {
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);
    }
}

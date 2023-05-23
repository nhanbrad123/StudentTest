package firsttest;

public class StudentList {
    public static void main(String args[])
    {
        Student s1 = new Student("s1", "Nhan");
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = s1;
        studentList[2] = s1;
        for (int i=0;i<studentList.length;i++)
        {
            System.out.println(studentList[0].getStudentName());
        }
    }
}

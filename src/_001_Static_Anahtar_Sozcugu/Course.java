package _001_Static_Anahtar_Sozcugu;

public class Course {
    String name;
    String code;
    int note;
    public Course(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }
    public static void courseList() {
        String[] courseList = {"fizik", "kimya", "matematik"};
        for (String courseName : courseList) {
            System.out.println(courseName);
        }
    }
}

public class Static_Keyword {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.Schoolname = "KVS";
    }
}
class Student {
    String name;
    int roll;
    static  String Schoolname;
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

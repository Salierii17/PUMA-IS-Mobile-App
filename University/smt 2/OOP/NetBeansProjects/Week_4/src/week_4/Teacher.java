package week_4;
class Teacher {
    String designation = "Teacher";
    String collegeName="Beginnersbook";
    void does(){
        System.out.println("teaching");
    }
}

class PhysicsTeacher extends Teacher{
    private final String mainSubject = "Physics";
    public static void main(String[] args){
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
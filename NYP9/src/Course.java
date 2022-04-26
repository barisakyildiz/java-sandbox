import java.util.ArrayList;

public class Course {

    private String name;
    private String code;
    private ArrayList<Student> students;
    private int capacity;

    public Course(String name, int capacity, String code) {
        setStudents(new ArrayList<Student>());
        this.setCapacity(capacity);
        this.setName(name);
        this.setCode(code);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStudentCount(){
        return students.size();
    }

    public void increaseCapacity(int newCapacity){
        if(capacity < newCapacity){
            capacity = newCapacity;
        }
    }

    public Student findStudent(String number){
        for(Student std : students){
            if(std.getNumber().compareTo(number) == 0);
            return std;
        }
        return null;
    }

    public void showClassList(){
        System.out.println("Bu dersi " + students.size() + " öğrenci almıştır");
        System.out.println("Bu Öğrencilerin Numara ve isimleri aşağıda verilmiştir");
        int i = 1;
        for(Student std : students){
            System.out.println(i + ") " + std.getNumber() + " --> " + std.getName());
            i++;
        }
    }

    public boolean addStudent(Student student){
        if(getStudentCount() < capacity  && findStudent(student.getName()) == null){
            students.add(student);
            return true;
        }else{
            return false;
        }
    }

}

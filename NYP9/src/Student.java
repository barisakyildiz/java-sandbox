public class Student {

    private String number;
    private String name;


    public Student(String number, String name) {
        this.setNumber(number);
        this.setName(name);
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String number) {
        this.name = number;
    }
}

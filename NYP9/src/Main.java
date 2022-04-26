public class Main {

    public static void main(String[] args) {

        Course nyp = new Course("Nesneye Yönelik Programlama", 5, "BLM2012");
        Student std1 = new Student("20011046", "Barış Akyıldız");
        Student std2 = new Student("200110497", "sjsj31oğlu sjsj31");

        if(!nyp.addStudent(std1) ){
            System.out.println(std1.getName() + " isimli ogrenci eklenemedi");
        }

        if(!nyp.addStudent(std2)){
            System.out.println(std2.getName() + " isimli ogrenci eklenemedi");
        }


    }
}

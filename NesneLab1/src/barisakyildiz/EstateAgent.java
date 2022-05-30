package barisakyildiz;

public class EstateAgent {

    private String name;
    private int i = 0;

    Home[] home = new Home[]{};


    void hasHome(Home home1){
        home[i] = home1;
        i++;
    }
    void listHome(){
        for(Home home2:home){
            System.out.println(home2);
        }
    }
    void sellHome(Home home1, Customer customer1){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

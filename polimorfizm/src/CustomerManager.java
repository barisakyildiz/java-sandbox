public class CustomerManager {

    private BaseLogger Logger;

    public CustomerManager(BaseLogger logger){
        this.Logger = logger;
    }

    public void Add(){
        System.out.println("Müşteri Eklendi");
        this.Logger.Log("log mesajı");
    }

}

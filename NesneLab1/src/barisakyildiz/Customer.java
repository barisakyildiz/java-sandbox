package barisakyildiz;

public class Customer {

    private String name;
    private String telephone;
    private String address;
    private Home[] hm;
    private int homeCounter;
    private double payment;

    public Customer(String name, String telephone, String address) {
        this.setName(name);
        this.setTelephone(telephone);
        this.setAddress(address);
    }

    public void buyHome(Home home1) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHomeCounter() {
        return homeCounter;
    }

    public void setHomeCounter(int homeCounter) {
        this.homeCounter = homeCounter;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}

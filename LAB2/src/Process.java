public class Process extends User{

    private String name;
    private int required_memory;
    private User user;

    public Process(){
        this.setName(name);
        this.setRequired_memory(required_memory);
        this.setUser(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequired_memory() {
        return required_memory;
    }

    public void setRequired_memory(int required_memory) {
        this.required_memory = required_memory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String toString(){
        return getName();
    }
}

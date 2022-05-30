import java.util.HashMap;
import java.util.LinkedList;

public class ProcessManager extends Process implements IProcessManager{

    private int used_memory_size;
    private int max_memory_size;
    private HashMap<String, Process> processMaps;
    private LinkedList<Process> waitingProcessList;


    public ProcessManager(int max_memory_size){
        this.setMax_memory_size(max_memory_size);
    }

    public int getMax_memory_size() {
        return max_memory_size;
    }

    public void setMax_memory_size(int max_memory_size) {
        this.max_memory_size = max_memory_size;
    }

    public int getUsed_memory_size() {
        return used_memory_size;
    }

    public boolean add_process(User user, String name, int required_memory){
        Process process = new Process();
        if((used_memory_size + required_memory) <= max_memory_size) {
            processMaps.put(name, process);
        }else{
            waitingProcessList.add(process);
        }
        return false;
    }

    public void print_processes(){
        processMaps.forEach((key, value) -> {
            System.out.println(key);
        });
    }

    public void print_waiting_processes(){
        waitingProcessList.forEach((key) -> {
            System.out.println(key.getName());
        });
    }

    public boolean remove_process(String name) throws Exception{
        try{
            used_memory_size -= processMaps.get(name).getRequired_memory();
            processMaps.remove(name);
        }catch(Exception e){
            System.out.println("Process Not Found" + e);
        }
        return false;
    }



}

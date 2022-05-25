public class KronometreThread implements Runnable{

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Olusturuluyor " + threadName);
    }

    public void run(){
        System.out.println("Calistiriliyor " + threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Kesildi " + threadName + " with " + e);
        }
        System.out.println("Thread Bitti " + threadName);

    }

    public void start(){
        System.out.println("Thread nesnesi olusuyor");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}

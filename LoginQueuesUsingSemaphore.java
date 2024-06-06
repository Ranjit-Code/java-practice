import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LoginQueuesUsingSemaphore {
    public static void main(String args[]){
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        IntStream.range(0, 10)
                .forEach(user -> executorService.execute(runnable));
        executorService.shutdown();

    }
}

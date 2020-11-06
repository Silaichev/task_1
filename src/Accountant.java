import java.util.ArrayDeque;
import java.util.Queue;

public class Accountant {
    private Queue<Worker> workers = new ArrayDeque<Worker>();


    public void calculate(){
        while(!workers.isEmpty()){
            System.out.println(workers.peek().info()+workers.poll().monthlySalary());
        }
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }
}

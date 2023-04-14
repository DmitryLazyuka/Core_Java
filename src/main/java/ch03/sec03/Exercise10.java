package ch03.sec03;

public class Exercise10 {
    public static void main(String[] args) {
        Runnable[] tasks = new Runnable[]{new Greeter(5, "task1"), new Greeter(5, "task2"), new Greeter(5, "task3")};
        runTogether(tasks);
        runInOrder(tasks);

        //Exercise 14
        getTask(tasks).run();
    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks
        ) {
            new Thread(task).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks
        ) {
            task.run();
        }
    }

    //Exercise 14
    public static Runnable getTask(Runnable... tasks){
        return () -> {
            for (Runnable task : tasks) {
                task.run();
            }
        };
    }
}
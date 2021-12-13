public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThreadSecond myThreadSecond = new MyThreadSecond();
        myThread.start();
        myThreadSecond.start();
    }
}

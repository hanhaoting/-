class AThread extends Thread {
    @Override
    public void run() {
        System.out.println("cdl");
        System.out.println(Thread.currentThread().getId());
    }
}

class BThread extends Thread{
    public void run(){


        System.out.println("noob");
        System.out.println(Thread.currentThread().getName());
    }
}

// 测试类
public class Main {
    public static void main(String[] args) {
      AThread a=new AThread();
      BThread b=new BThread();
      a.start();
      b.start();

    }
}

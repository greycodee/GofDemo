package top.mjava.factory.factory;

/**
 * 奔驰摩托
 * */
public class BenzMoto implements Moto {
    @Override
    public void lights() {
        System.out.println("奔驰摩托开启了车灯");
    }

    @Override
    public void run() {
        System.out.println("闪开　奔驰摩托跑起来了");
    }
}

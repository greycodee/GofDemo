package top.mjava.factory.factory;

/**
 * 五菱摩托
 * */
public class WulingMoto implements Moto {
    @Override
    public void lights() {
        System.out.println("五菱摩托开启了车灯");
    }

    @Override
    public void run() {
        System.out.println("五菱摩托去飙车－－");
    }
}

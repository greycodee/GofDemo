package top.mjava.factory.factory;

/**
 * 莱斯莱斯摩托
 * */
public class RollsRoyceMoto implements Moto {
    @Override
    public void lights() {
        System.out.println("劳斯莱斯摩托低调地开启了车灯");
    }

    @Override
    public void run() {
        System.out.println("劳斯莱斯摩托慢慢的跑起来了");
    }
}

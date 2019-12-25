package top.mjava.factory.abstractFactory;

/**
 * 小米空调
 * */
public class XiaomiAir implements AirConditioning{
    @Override
    public void heat() {
        System.out.println("小米空调开始制热～");
    }

    @Override
    public void cold() {
        System.out.println("小米空调开始制冷了．．");
    }
}

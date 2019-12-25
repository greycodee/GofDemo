package top.mjava.factory.abstractFactory;

/**
 * 格力空调
 * */
public class GreeAir implements AirConditioning {
    @Override
    public void heat() {
        System.out.println("格力空调制热中．．");
    }

    @Override
    public void cold() {
        System.out.println("格力空调开始制冷了．．");
    }
}

package top.mjava.factory.factory;

/**
 * 五菱汽车工厂
 * */
public class WulingFactory implements AllCarFactory {
    @Override
    public Car getCar() {
        return new Wuling();
    }

    @Override
    public Moto createMoto() {
        return new WulingMoto();
    }
}

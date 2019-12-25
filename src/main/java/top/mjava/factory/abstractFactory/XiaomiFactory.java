package top.mjava.factory.abstractFactory;

/**
 * 小米工厂
 * */
public class XiaomiFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public AirConditioning createAir() {
        return new XiaomiAir();
    }
}

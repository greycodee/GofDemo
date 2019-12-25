package top.mjava.factory.abstractFactory;

/**
 * 格力工厂
 * */
public class GreeFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new GreePhone();
    }

    @Override
    public AirConditioning createAir() {
        return new GreeAir();
    }
}

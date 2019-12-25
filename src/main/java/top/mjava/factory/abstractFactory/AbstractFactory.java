package top.mjava.factory.abstractFactory;

/**
 * 抽象工厂
 * */
interface AbstractFactory {
    /**
     * 造手机
     * */
    Phone createPhone();
    /**
     * 造空调
     * */
    AirConditioning createAir();
}

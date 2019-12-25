package top.mjava.factory.factory;

/**
 * 工厂可以生产什么
 *
 * 抽象工厂
 * */
public interface AllCarFactory {
    /**
     * 生产汽车
     * */
    Car getCar();

    /**
     * 生产摩托车
     * */
    Moto createMoto();
}

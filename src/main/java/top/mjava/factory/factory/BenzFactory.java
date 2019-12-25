package top.mjava.factory.factory;

/**
 * 奔驰汽车工厂
 * */
public class BenzFactory implements AllCarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }

    @Override
    public Moto createMoto() {
        return new BenzMoto();
    }
}

package top.mjava.factory.factory;

/**
 * 劳斯莱斯汽车工厂
 * */
public class RollsRoyceFactory implements AllCarFactory {
    @Override
    public Car getCar() {
        return new RollsRoyce();
    }

    @Override
    public Moto createMoto() {
        return new RollsRoyceMoto();
    }
}

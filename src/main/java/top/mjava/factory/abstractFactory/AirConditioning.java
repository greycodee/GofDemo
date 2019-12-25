package top.mjava.factory.abstractFactory;

/**
 * 定义空调
 * */
public interface AirConditioning {
    /**
     * 空调可以制热
     * */
    void heat();
    /**
     * 空调可以制冷
     * */
    void cold();
}

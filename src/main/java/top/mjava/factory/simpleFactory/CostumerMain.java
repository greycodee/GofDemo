package top.mjava.factory.simpleFactory;


/**
 * 买车
 *
 * 简单工厂模式
 * */
public class CostumerMain {
    public static void main(String[] args) {
        //跟车厂说一声我要五菱神车
        Car wuling=CarFactory.getCar("我要五菱神车");
        //跟车厂说一声我要大奔驰
        Car Benz=CarFactory.getCar("我要大奔驰");

        //开着五菱神车去兜兜风
        wuling.run();
        //开着大奔去兜兜风
        Benz.run();
    }
}

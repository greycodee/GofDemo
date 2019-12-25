package top.mjava.factory.simpleFactory;

/**
 * 汽车工厂
 *
 * 静态工厂
 *
 * 简单工厂
 * */
public class CarFactory {
    public static Car getCar(String type){
        if("我要五菱神车".equals(type)){
            return new Wuling();
        }
        if ("我要大奔驰".equals(type)){
            return new Benz();
        }
        return null;
    }
}

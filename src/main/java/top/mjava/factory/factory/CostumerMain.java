package top.mjava.factory.factory;


/**
 * 土豪买车记
 *
 * 工厂方法模式
 * */
public class CostumerMain {
    public static void main(String[] args) {
        System.out.println("===========奔驰系列产品===========");
        AllCarFactory benzFactory=new BenzFactory();
        //来一辆奔驰汽车
        Car benzCar=benzFactory.getCar();
        //来一辆奔驰摩托
        Moto benzMoto=benzFactory.createMoto();

        benzCar.run();
        benzMoto.lights();
        benzMoto.run();

        System.out.println("===========五菱系列产品===========");
        AllCarFactory wulingFactory=new WulingFactory();
        //来一辆五菱神车
        Car wulingCar=wulingFactory.getCar();
        //来一辆五菱大摩托
        Moto wulingMoto=wulingFactory.createMoto();

        wulingCar.run();
        wulingMoto.run();
        wulingMoto.lights();
    }
}

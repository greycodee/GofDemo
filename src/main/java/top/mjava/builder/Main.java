package top.mjava.builder;

/**
 * 建造者模式
 * @author zheng
 * */
public class Main {
    public static void main(String[] args) {
        //造一辆宝马
        Car bmw=Boss.builderCar(new BMWBuilder());
        System.out.println("宝马车:"+bmw.show());
        //造一辆奔驰
        Car benz=Boss.builderCar(new BenzBuilder());
        System.out.println("奔驰车:"+benz.show());
    }
}

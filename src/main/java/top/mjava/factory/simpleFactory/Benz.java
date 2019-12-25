package top.mjava.factory.simpleFactory;

/**
 * 奔驰车
 * */
public class Benz implements Car {
    @Override
    public void run() {
        System.out.println("大奔开动了");
    }
}

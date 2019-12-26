package top.mjava.builder;
/**
 * 奔驰车建造者
 * */
public class BenzBuilder extends AbstractBuild {
    @Override
    void buildEngine() {
        car.setEngine("奔驰的发动机");
    }

    @Override
    void buildSteering() {
        car.setSteering("奔驰的方向盘");
    }

    @Override
    void buildFrame() {
        car.setFrame("奔驰的车架");
    }

    @Override
    void buildTire() {
        car.setTire("奔驰的轮胎");
    }
}

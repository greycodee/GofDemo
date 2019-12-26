package top.mjava.builder;

/**
 * 抽象建造者 定义造车的方法
 * */
abstract class AbstractBuild {
    /**
     * 造的产品是车
     * */
    protected Car car=new Car();
    /**
     * 造发动机
     * */
    abstract void buildEngine();
    /**
     * 造轮胎
     * */
    abstract void buildSteering();
    /**
     * 造车架
     * */
    abstract void buildFrame();
    /**
     * 造轮胎
     * */
    abstract void buildTire();
    /**
     * 得到造好的车
     * */
    public Car getCar(){
        return this.car;
    }
}

package top.mjava.temolateMethod;

/**
 * 大牛买电脑
 * */
public class Daniu extends AGouShop{
    @Override
    void cpu() {
        System.out.println("大牛选了cpn");
    }

    @Override
    void dianYuan() {
        System.out.println("大牛选了电源");
    }

    @Override
    void zhuBan() {
        System.out.println("大牛选了主板");
    }

    @Override
    void yingPan() {
        System.out.println("大牛选了硬盘");
    }

    @Override
    void neiCun() {
        System.out.println("大牛选了内存条");
    }

    @Override
    void jiXiang() {
        System.out.println("大牛选了机箱");
    }

    @Override
    public boolean isTrue() {
        return false;
    }
}

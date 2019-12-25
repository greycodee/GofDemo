package top.mjava.temolateMethod;

/**
 * 阿猫买电脑
 * */
public class AMao extends AGouShop {
    @Override
    void cpu() {
        System.out.println("阿猫选了cpn");
    }

    @Override
    void dianYuan() {
        System.out.println("阿猫选了电源");
    }

    @Override
    void zhuBan() {
        System.out.println("阿猫选了主板");
    }

    @Override
    void yingPan() {
        System.out.println("阿猫选了硬盘");
    }

    @Override
    void neiCun() {
        System.out.println("阿猫选了内存条");
    }

    @Override
    void jiXiang() {
        System.out.println("阿猫选了机箱");
    }

}

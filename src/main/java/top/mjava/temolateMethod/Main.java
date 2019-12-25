package top.mjava.temolateMethod;
/**
 * 模板方法模式
 * */
public class Main {
    public static void main(String[] args) {
        //阿猫
        AMao aMao=new AMao();
        aMao.zhuZHuang();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        //大牛
        Daniu daniu=new Daniu();
        daniu.zhuZHuang();
    }
}

package top.mjava.factory.abstractFactory;
/**
 * 抽象工厂模式
 * */
public class ConsumerＭain {
    public static void main(String[] args) {
        //找到了小米工厂
        AbstractFactory xiaomi=new XiaomiFactory();
        //在小米工厂买空调
        AirConditioning xiaomiAir=xiaomi.createAir();
        //在小米工厂买个手机吧
        Phone xiaomiPhone=xiaomi.createPhone();


        //找到了格力工厂
        AbstractFactory gree=new GreeFactory();
        //在格力工厂买个空调吧　
        AirConditioning greeAir=gree.createAir();
        //去在格力工厂买个手机
        Phone greePhone=gree.createPhone();

        /*---------------------------------------------------*
         *            试下新买来的产品                           *
         * ---------------------------------------------------*/
        xiaomiAir.cold();
        xiaomiAir.heat();
        xiaomiPhone.call();
        xiaomiPhone.music();
        System.out.println("-----------------------------------");
        greeAir.heat();
        greeAir.cold();
        greePhone.music();
        greePhone.webView();
    }
}

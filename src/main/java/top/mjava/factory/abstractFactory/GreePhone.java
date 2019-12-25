package top.mjava.factory.abstractFactory;

/**
 * 格力手机
 * */
public class GreePhone implements Phone {
    @Override
    public void webView() {
        System.out.println("格力手机浏览网页");
    }

    @Override
    public void call() {
        System.out.println("格力手机打电话");
    }

    @Override
    public void music() {
        System.out.println("格力手机听歌");
    }
}

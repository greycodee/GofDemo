package top.mjava.factory.abstractFactory;

/**
 * 小米手机
 * */
public class XiaomiPhone implements Phone {
    @Override
    public void webView() {
        System.out.println("小米手机浏览网页中");
    }

    @Override
    public void call() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void music() {
        System.out.println("用小米手机听周杰伦的歌");
    }
}

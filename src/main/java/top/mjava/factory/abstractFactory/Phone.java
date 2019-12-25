package top.mjava.factory.abstractFactory;

/**
 * 定义手机
 * */
public interface Phone {
    /**
     * 手机可以浏览网页
     * */
    void webView();
    /**
     * 手机可以打电话
     * */
    void call();
    /**
     * 手机可以听音乐
     * */
    void music();
}

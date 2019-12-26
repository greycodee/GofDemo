package top.mjava.builder;

import lombok.Data;
/**
 * 汽车 产品类 定义汽车的构成
 * */
@Data
public class Car {
    /**
     * 方向盘
     * */
    private String steering;
    /**
     * 发动机
     * */
    private String engine;
    /**
     * 车架
     * */
    private String frame;
    /**
     * 轮胎
     * */
    private String tire;
    /**
     * 展示一下汽车配置
     * */
    public String show() {
        return "{" +
                "steering='" + steering + '\'' +
                ", engine='" + engine + '\'' +
                ", frame='" + frame + '\'' +
                ", tire='" + tire + '\'' +
                '}';
    }
}

package top.mjava.prototype;

import java.util.ArrayList;

/**
 * 原型模式
 * @author zheng
 * */
public class Main {
    public static void main(String[] args) {
        //我是鸣人本人
        Naruto naruto=new Naruto();
        //我是影分身
        Naruto narutoYin=naruto.clone();

        narutoYin.setTask("上课");
        //影分身不配有爱好
        narutoYin.getHobby().clear();
        naruto.setTask("吃拉面");


        System.out.println("鸣人本人:"+naruto.toString());
        System.out.println("影分身:"+narutoYin.toString());

    }
}

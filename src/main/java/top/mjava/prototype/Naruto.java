package top.mjava.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zheng
 *
 * 我是鸣人实体类
 */
@Data
public class Naruto implements Cloneable{
    /**
     * 姓名
     * */
    private String name="鸣人";
    /**
     * 年龄
     * */
    private final int age=13;
    /**
     * 任务
     * */
    private String task;
    /**
     *爱好
     * */
    private ArrayList<String> hobby=new ArrayList<>();
    /**
     * 构造方法
     * */
    public Naruto(){
        this.hobby.add("吃拉面");
        this.hobby.add("泡温泉");
    }

    /**
     * 重写Object类的clone方法
     * */
    @Override
    public Naruto clone(){
        Naruto naruto=null;
        try {
            naruto=(Naruto)super.clone();
            naruto.hobby= (ArrayList<String>) this.hobby.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return naruto;
    }

    @Override
    public String toString() {
        return "Naruto{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", task='" + task + '\'' +
                ", hobby=" + hobby +
                '}';
    }
}

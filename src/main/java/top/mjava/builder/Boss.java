package top.mjava.builder;

/**
 * 所有的建造者要听这个包工头的话,叫你造什么就造什么
 * */
public class Boss {

    public static Car builderCar(AbstractBuild build){
        build.buildEngine();
        build.buildFrame();
        build.buildSteering();
        build.buildTire();
        return build.getCar();
    }
}

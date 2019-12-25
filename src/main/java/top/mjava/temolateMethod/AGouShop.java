package top.mjava.temolateMethod;

/**
 * 阿狗电脑店
 * */
abstract class AGouShop {
    /**
     *　显卡
     * ＂具体方法＂
     * */
    protected void xianKa(){
        System.out.println("客户选了显卡");
    }
    /**
     * 是否要显卡　　默认是要显卡的
     * ＂钩子方法＂
     * */
    public boolean isTrue(){
        return true;
    }
    /**
     *cpu
     * */
    abstract void cpu();
    /**
     *电源
     * */
    abstract void dianYuan();
    /**
     *主板
     * */
    abstract void zhuBan();
    /**
     *硬盘
     * */
    abstract void yingPan();
    /**
     *内存条
     * */
    abstract void neiCun();
    /**
     *机箱
     * */
    abstract void jiXiang();

    /**
     * 阿狗帮客户装电脑
     * 模板方法
     * */
    public void zhuZHuang(){
        System.out.println("阿狗开始组装电脑＝＝＝＝＝＝");
        this.cpu();
        this.dianYuan();
        this.neiCun();
        if(this.isTrue()) {
            this.xianKa();
        }
        this.yingPan();
        this.zhuBan();
        this.jiXiang();
        System.out.println("阿狗电脑组装完成＝＝＝＝＝＝");
    }
}

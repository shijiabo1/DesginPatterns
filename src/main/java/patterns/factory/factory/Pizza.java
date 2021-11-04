package patterns.factory.factory;

/**
 * @author shizhenbo
 * @title: Pizza
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/413:09
 */
public abstract class Pizza {

    public void prepare() {
        System.out.println("准备披萨");
    }

    public void bake() {
        System.out.println("披萨开始烘焙");
    }

    public void cut() {
        System.out.println("分披萨");
    }

    public void box() {
        System.out.println("打包披萨");
    }


}

package patterns.factory.simplefactory;

/**
 * @author shizhenbo
 * @title: CheesePizza
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/413:16
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("开始准备奶酪披萨");
    }
}

package patterns.factory.simplefactory;

/**
 * @author shizhenbo
 * @title: ClamPizza
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/413:18
 */
public class ClamPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("开始准备蛤蜊披萨");
    }
}

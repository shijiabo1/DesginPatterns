package patterns.factory.factory;


public class NYClamPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("开始制作纽约蛤蜊披萨");
    }
}

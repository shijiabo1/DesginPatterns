package patterns.factory.factory;

public class BJPizzaCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("开始制作北京奶酪披萨");
    }
}

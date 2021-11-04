package patterns.factory.factory;


public class NYPizzaCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("开始制作纽约奶酪披萨");
    }
}

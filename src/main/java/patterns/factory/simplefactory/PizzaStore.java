package patterns.factory.simplefactory;

/**
 * @author shizhenbo
 * @title: PizzaStore
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/413:22
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

package patterns.factory.factory;


/**
 * @author shizhenbo
 * @title: PizzaStore
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/413:41
 */
public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(String type);
}

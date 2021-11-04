package patterns.factory.simplefactory;

/**
 * @author shizhenbo
 * @title: Main
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/413:22
 */
public class Main {
    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza("cheese");
        store.orderPizza("clam");

    }
}

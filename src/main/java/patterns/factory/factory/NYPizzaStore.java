package patterns.factory.factory;

/**
 * @author shizhenbo
 * @title: NYPizzaStore
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/413:44
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;
        if (type.equals("奶酪")){
            pizza = new NYPizzaCheesePizza();
        }else if (type.equals("蛤蜊")) {
            pizza = new NYClamPizza();
        }
        return pizza;
    }
}

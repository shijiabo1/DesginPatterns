package patterns.factory.simplefactory;


public class SimplePizzaFactory {
    Pizza pizza = null;

    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}

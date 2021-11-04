package patterns.factory.factory;


public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore bjStore = new BJPizzaStore();

        nyStore.orderPizza("奶酪");
        bjStore.orderPizza("奶酪");

        nyStore.orderPizza("蛤蜊");
        bjStore.orderPizza("蛤蜊");
    }
}

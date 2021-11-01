package patterns.singleton;

import java.io.IOException;

/**
 * @author shizhenbo
 * @title: OrderController
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/9/114:28
 */
public class OrderController {
    private Logger logger = new Logger();

    public OrderController() throws IOException {
    }

    public void create(String order) throws IOException {
        // ...省略业务逻辑代码...
        logger.log("Created an order: " + order);  }
}

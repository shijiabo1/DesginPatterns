package patterns.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author shizhenbo
 * @title: Logger
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/9/114:17
 */
public class Logger {
    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("E:\\examples\\design_pattern\\log.txt");
        writer = new FileWriter(file, true);
    }

    public void log(String message) throws IOException {
        writer.write(message);
    }
}


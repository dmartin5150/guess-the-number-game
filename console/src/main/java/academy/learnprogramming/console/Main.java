package academy.learnprogramming.console;

import academy.learnprogramming.NumberGenerator;
import academy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {


    public static void main(String[] args) {
        log.info("Guess the number game");
        // create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(GameConfig.class);
        // get number generator bean from context (container)
        NumberGenerator numberGenerator
                = context.getBean(NumberGenerator.class);


        context.close();


    }
}

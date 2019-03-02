package CodeToTheInterfaceSpringF.Config;

import CodeToTheInterface.WordGame;
import CodeToTheInterface.WordGameImp;
import CodeToTheInterface.WordGameInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="WordGame")
    public WordGameInterface getService(){
        return new WordGameImp();
    }
}

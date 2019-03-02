package CodeToTheInterface;

import CodeToTheInterfaceSpringF.Config.AppConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
Testing the  concatenate method if String "a" concatenates String "b" correct

 */

public class WordGameTest {
private WordGameInterface wordGame;

    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        wordGame = (WordGameInterface)ctx.getBean("wordGame");
    }
    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test
    public void concatenate() throws Exception{
        // WordsGame wg = new WordsGame();
        WordGameInterface wgi = new WordGameImp();
        Assert.assertEquals("a+b", wgi.concatenate("Ziya","nda"));

    }
}

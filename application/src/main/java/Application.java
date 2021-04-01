import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.darkdevil.*"
})
@ImportResource({ "classpath:sample.xml", "classpath:sample2.xml" })
public class Application
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }
}

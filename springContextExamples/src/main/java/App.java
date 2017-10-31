import com.kravchenko.MainConfiguration;
import com.kravchenko.service.BlogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);

        BlogService bean = context.getBean(BlogService.class);
        bean.createBlogs();
        bean.printAllBlogs();
    }

    private static void printAllBeans(ApplicationContext context) {
        for (String str : context.getBeanDefinitionNames()) {
            System.out.println(str);
        }
    }
}

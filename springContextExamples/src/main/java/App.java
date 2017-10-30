import com.kravchenko.MainConfiguration;
import com.kravchenko.model.Blog;
import com.kravchenko.repository.BlogRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        for (String str : context.getBeanDefinitionNames()) {
            System.out.println(str);
        }
        BlogRepository blogRepository = context.getBean( BlogRepository.class);
        blogRepository.save(Blog.of("Programming road"));
        blogRepository.save(Blog.of("Literature club"));
        blogRepository.save(Blog.of("Eating grenades"));

        blogRepository.getAll().forEach(System.out::println);
//        ValidationService bean = context.getBean(ValidationService.class);
//        System.out.println(bean);
    }
}

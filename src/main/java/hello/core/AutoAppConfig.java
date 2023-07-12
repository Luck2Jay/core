package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class) //AppConfig 제외 위해
)
public class AutoAppConfig {

}

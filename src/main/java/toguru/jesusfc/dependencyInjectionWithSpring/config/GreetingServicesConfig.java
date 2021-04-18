package toguru.jesusfc.dependencyInjectionWithSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import toguru.jesusfc.dependencyInjectionWithSpring.services.ConstructorGreetingServiceImpl;
import toguru.jesusfc.dependencyInjectionWithSpring.services.PropertyInjectedGreetingServiceImpl;
import toguru.jesusfc.dependencyInjectionWithSpring.services.SetterInjectedGreetingServiceImpl;

/**
 * Created By Jesús Fdez. Caraballo on 18/04/2021.
 * 3 Spring beans in a configuration class
 */
@Configuration
public class GreetingServicesConfig {

    @Bean
    ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
        return new ConstructorGreetingServiceImpl();
    }

    @Bean
    PropertyInjectedGreetingServiceImpl propertyInjectedGreetingServiceImpl() {
        return new PropertyInjectedGreetingServiceImpl();
    }

    @Bean
    SetterInjectedGreetingServiceImpl setterInjectedGreetingServiceImpl() {
        return new SetterInjectedGreetingServiceImpl();
    }
}

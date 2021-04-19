package toguru.jesusfc.dependencyInjectionWithSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Profile;
import toguru.jesusfc.dependencyInjectionWithSpring.repositories.EnglishGreetingRepository;
import toguru.jesusfc.dependencyInjectionWithSpring.repositories.EnglishGreetingRepositoryImpl;
import toguru.jesusfc.dependencyInjectionWithSpring.services.*;
import toguru.jesusfc.pets.PetService;
import toguru.jesusfc.pets.PetServiceFactory;

/**
 * Created By Jesús Fdez. Caraballo on 18/04/2021.
 * 3 Spring beans in a configuration class
 */
@Configuration
public class GreetingServicesConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory().getPetService(("dog"));
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingServiceImpl i18nSpanishGreetingServiceImpl() {
        return new I18nSpanishGreetingServiceImpl();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingServiceImpl i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingServiceImpl(englishGreetingRepository);
    }

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

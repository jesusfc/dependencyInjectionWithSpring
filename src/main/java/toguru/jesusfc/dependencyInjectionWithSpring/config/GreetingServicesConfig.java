package toguru.jesusfc.dependencyInjectionWithSpring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import toguru.jesusfc.dependencyInjectionWithSpring.datasource.FakeDataSource;
import toguru.jesusfc.dependencyInjectionWithSpring.repositories.EnglishGreetingRepository;
import toguru.jesusfc.dependencyInjectionWithSpring.repositories.EnglishGreetingRepositoryImpl;
import toguru.jesusfc.dependencyInjectionWithSpring.services.I18nEnglishGreetingServiceImpl;
import toguru.jesusfc.dependencyInjectionWithSpring.services.I18nSpanishGreetingServiceImpl;
import toguru.jesusfc.dependencyInjectionWithSpring.services.PropertyInjectedGreetingServiceImpl;
import toguru.jesusfc.dependencyInjectionWithSpring.services.SetterInjectedGreetingServiceImpl;
import toguru.jesusfc.pets.PetService;
import toguru.jesusfc.pets.PetServiceFactory;

/**
 * Created By Jesús Fdez. Caraballo on 18/04/2021.
 * 3 Spring beans in a configuration class
 */
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServicesConfig {


    @Bean
    FakeDataSource fakeDataSource(AppConfiguration appConfiguration) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(appConfiguration.getUsername());
        fakeDataSource.setPassword(appConfiguration.getPassword());
        fakeDataSource.setJdbcurl(appConfiguration.getJdbcurl());
        return fakeDataSource;
    }

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

    /* Insertamos el bean en el contexto con el fichero sfgdi-config.xml
    @Bean
    ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
        return new ConstructorGreetingServiceImpl();
    }
    */

    @Bean
    PropertyInjectedGreetingServiceImpl propertyInjectedGreetingServiceImpl() {
        return new PropertyInjectedGreetingServiceImpl();
    }

    @Bean
    SetterInjectedGreetingServiceImpl setterInjectedGreetingServiceImpl() {
        return new SetterInjectedGreetingServiceImpl();
    }
}

package toguru.jesusfc.dependencyInjectionWithSpring.services;

import toguru.jesusfc.dependencyInjectionWithSpring.repositories.EnglishGreetingRepository;

/**
 * Created By Jesús Fdez. Caraballo on 03/04/2021.
 */
public class I18nEnglishGreetingServiceImpl implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingServiceImpl(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN - I18nEnglishGreetingServiceImpl";
    }
}

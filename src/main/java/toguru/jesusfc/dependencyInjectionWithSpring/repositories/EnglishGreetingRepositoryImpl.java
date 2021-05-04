package toguru.jesusfc.dependencyInjectionWithSpring.repositories;

import toguru.jesusfc.dependencyInjectionWithSpring.services.GreetingService;

/**
 * Created By Jesús Fdez. Caraballo on 18/04/2021.
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN - Fron EnglishGreetingRepositoryImpl";
    }

}

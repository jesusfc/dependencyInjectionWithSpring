package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 03/04/2021.
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

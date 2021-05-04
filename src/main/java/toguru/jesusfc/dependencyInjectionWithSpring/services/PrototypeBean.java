package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creamos un PrototypeBean bean!!!!");
    }

    public String getMyScope() {
        return "Soy un PrototypeBean";
    }
}

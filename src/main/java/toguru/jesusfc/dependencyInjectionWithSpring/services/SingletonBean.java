package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */

/**
 * No es necesario añadir el scope_singlenton
 * ya que por defecto SpringFramework lo indica
 * por defecto.
 * Por lo tanto, cualquier clase con @Component
 * será creado como un singleton
 */
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creamos un Siglenton bean!!!!");
    }

    public String getMyScope() {
        return "Soy un Singleton";
    }
}

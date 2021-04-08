package toguru.jesusfc.dependencyInjectionWithSpring.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created By Jesús Fdez. Caraballo on 08/04/2021.
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### Creamos el Bean Factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### El nombre del Bean es: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### El LifeCycle ha sido destruido");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### El LifeCycle bean está en afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### Se ha creado el ApplicationContext");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Predestroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}

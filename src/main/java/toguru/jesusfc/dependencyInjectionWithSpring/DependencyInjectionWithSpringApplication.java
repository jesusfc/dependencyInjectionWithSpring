package toguru.jesusfc.dependencyInjectionWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import toguru.jesusfc.dependencyInjectionWithSpring.controllers.*;

@ComponentScan(basePackages = {"toguru.jesusfc.pets", "toguru.jesusfc.dependencyInjectionWithSpring"})
@SpringBootApplication
public class DependencyInjectionWithSpringApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(DependencyInjectionWithSpringApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("Cual es la mejor mascota: ");
        System.out.println(petController.cualEsElMejor());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayhello());

        MyController myController;
        myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        System.out.println("------ Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGretting());

        System.out.println("------ Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGretting());

        System.out.println("------ Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGretting());

    }

}

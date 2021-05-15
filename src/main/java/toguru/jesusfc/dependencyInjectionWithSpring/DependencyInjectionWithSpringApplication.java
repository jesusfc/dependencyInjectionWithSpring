package toguru.jesusfc.dependencyInjectionWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import toguru.jesusfc.dependencyInjectionWithSpring.config.AppConfiguration;
import toguru.jesusfc.dependencyInjectionWithSpring.controllers.*;
import toguru.jesusfc.dependencyInjectionWithSpring.datasource.FakeDataSource;
import toguru.jesusfc.dependencyInjectionWithSpring.services.PrototypeBean;
import toguru.jesusfc.dependencyInjectionWithSpring.services.SingletonBean;

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

        System.out.println("---------- Bean Scope");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

        System.out.println("\n---------- Fake Data Source\n");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcurl());
        System.out.println("\n----------\n");

        System.out.println("\n----Config Props Bean ------\n");
        AppConfiguration appConfiguration = ctx.getBean(AppConfiguration.class);
        System.out.println(appConfiguration.getUsername());
        System.out.println(appConfiguration.getPassword());
        System.out.println(appConfiguration.getJdbcurl());

        System.out.println("\n----Constructor Binding ------\n");

    }

}

package toguru.jesusfc.dependencyInjectionWithSpring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@ConfigurationProperties("jesusfc")
@Configuration
public class AppConfiguration {

    private String username;
    private String password;
    private String jdbcurl;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

    public void setJdbcurl(String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }

}

package soa.if5.vols;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import soa.if5.vols.entities.Airline;
import soa.if5.vols.entities.Escale;
import soa.if5.vols.entities.Vol;

@SpringBootApplication
public class VolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VolsApplication.class, args);
    }

}
@Configuration
class MyConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Airline.class);
        config.exposeIdsFor(Escale.class);
        config.exposeIdsFor(Vol.class);
    }
}


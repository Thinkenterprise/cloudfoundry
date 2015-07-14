package de.msg.xt.cloudfoundry.webapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication  
//@ImportResource(value={"context.xml"})
public class ApplicationConfiguration {

}

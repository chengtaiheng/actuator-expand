package actuator.expand.application.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 下面的类是actuator里面的一个类springboot-actuator包中的一个类
 */
@ConditionalOnClass(
        name = {"org.springframework.boot.actuate.endpoint.annotation.Endpoint"}
)
@Configuration
public class ActuatorExpandAutoConfig {

    public ActuatorExpandAutoConfig(){

    }

    @Bean
    public ActuatorExpandTester getActuatorExpandTester(){
        return  new  ActuatorExpandTester();
    }

}

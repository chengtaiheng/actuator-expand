package actuator.expand.application.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

import java.util.Random;

public class ActuatorExpandTester extends AbstractHealthIndicator {

    public ActuatorExpandTester() {
    }

    protected void doHealthCheck(Health.Builder var1) throws Exception {
        Random random = new Random();
        int i = random.nextInt(10);
        try {
            int result = i % 2;
            if (result == 0) {
                var1.up();
            } else {
                var1.down();
            }
        } catch (Exception ex) {
            var1.down();
        } finally {
            System.out.println("测试完成+i= ：" + i);
        }

    }
}

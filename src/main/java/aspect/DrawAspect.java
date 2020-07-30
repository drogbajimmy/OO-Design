package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DrawAspect {

    @Pointcut(value = "@annotation(aspect.Draw)")
    public void draw() {

    }

    @Before(value = "draw()")
    public void preprocessing(JoinPoint joinPoint) throws Throwable {
        System.out.println("preprocessing() starts");
    }

    @After(value = "draw()")
    public void postprocessing(JoinPoint joinPoint) throws Throwable {
        System.out.println("postprocessing() starts");
    }
}

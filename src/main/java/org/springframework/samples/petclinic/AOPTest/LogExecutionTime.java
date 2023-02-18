package org.springframework.samples.petclinic.AOPTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //@Target 는 어노테이션이 어디에 적용돠는지를 알린다 (여기서는 Method 한정)
@Retention(RetentionPolicy.RUNTIME) //@Rentention은 어노테이션인 언제 적용되는지를 알린다 (여기선 Runtime)
public @interface LogExectionTime {
}

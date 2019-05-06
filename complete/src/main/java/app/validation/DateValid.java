package app.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy={DateValidImp.class})
@Target({FIELD,ANNOTATION_TYPE})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface DateValid {
    String message() default "{0}は日付として許可された形式ではありません。";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    @Target({FIELD,ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    public @interface List {
        DateValid[] value();
    }
}


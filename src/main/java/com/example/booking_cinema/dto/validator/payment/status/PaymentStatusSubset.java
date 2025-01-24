package com.example.booking_cinema.dto.validator.payment.status;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

import com.example.booking_cinema.util.PaymentStatus;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy=PaymentStatusSubsetValidator.class)
public @interface PaymentStatusSubset {
    PaymentStatus[] anyOf();

    String message() default "must be any of {anyOf}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

package com.bachdv.lib.security.annotation;

import java.lang.annotation.*;

/**
 * Custom annotation, the cache method with this annotation will throw an exception
 * @author BachDV
 * Date : 22/03/2022
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}

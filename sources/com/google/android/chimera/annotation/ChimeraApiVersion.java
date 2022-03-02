package com.google.android.chimera.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ChimeraApiVersion(added = 101)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public @interface ChimeraApiVersion {
    long added();
}

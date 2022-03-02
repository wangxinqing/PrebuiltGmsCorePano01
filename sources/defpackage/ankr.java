package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ankr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ankr {
    public final Object a;
    public final Method b;
    private final Method c;

    private ankr(Object obj, Method method, Method method2) {
        this.a = obj;
        this.c = method;
        this.b = method2;
    }

    public static ankr a() {
        try {
            Object invoke = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
            Method method = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", new Class[]{Throwable.class, Integer.TYPE});
            Method method2 = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceDepth", new Class[]{Throwable.class});
            StackTraceElement stackTraceElement = (StackTraceElement) method.invoke(invoke, new Object[]{new Throwable(), 0});
            ((Integer) method2.invoke(invoke, new Object[]{new Throwable()})).intValue();
            return new ankr(invoke, method, method2);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    public final StackTraceElement a(Throwable th, int i) {
        try {
            return (StackTraceElement) this.c.invoke(this.a, new Object[]{th, Integer.valueOf(i)});
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e.getCause());
            } else if (e.getCause() instanceof Error) {
                throw ((Error) e.getCause());
            } else {
                throw new RuntimeException(e.getCause());
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}

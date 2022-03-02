package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: aorj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aorj {
    private static final anfk a = anfh.a.a((amqy) new aorf()).a();

    static aorg a() {
        return aorh.a;
    }

    private static Exception a(Class cls, Throwable th) {
        List asList = Arrays.asList(cls.getConstructors());
        anfk anfk = a;
        Object[] c = anbs.c(asList);
        Arrays.sort(c, anfk);
        ArrayList a2 = anda.a((Iterable) Arrays.asList(c));
        int size = a2.size();
        int i = 0;
        while (i < size) {
            Exception exc = (Exception) a((Constructor) a2.get(i), th);
            i++;
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(valueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    private static Object a(Constructor constructor, Throwable th) {
        Class[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
            return null;
        }
    }

    public static Object a(Future future, Class cls) {
        aori.b.a(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw a(cls, (Throwable) e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new aoqn((Error) cause);
            } else if (cause instanceof RuntimeException) {
                throw new aosq(cause);
            } else {
                throw a(cls, cause);
            }
        }
    }

    static void a(Class cls) {
        boolean z = true;
        amrl.a(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", (Object) cls);
        try {
            a(cls, (Throwable) new Exception());
        } catch (Exception e) {
            z = false;
        }
        amrl.a(z, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", (Object) cls);
    }
}

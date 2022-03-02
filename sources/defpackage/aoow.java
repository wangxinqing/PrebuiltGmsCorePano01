package defpackage;

import java.lang.reflect.Method;

/* renamed from: aoow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoow {
    public static final Object a;
    public static final Method b;

    static {
        b();
        Object c = c();
        a = c;
        b = c != null ? a() : null;
    }

    private aoow() {
    }

    public static StackTraceElement a(Class... clsArr) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int length = stackTrace.length - 1;
        StackTraceElement stackTraceElement = null;
        while (length >= 0) {
            StackTraceElement stackTraceElement2 = stackTrace[length];
            String className = stackTraceElement2.getClassName();
            for (Class name : clsArr) {
                if (className.equals(name.getName())) {
                    return stackTraceElement;
                }
            }
            length--;
            stackTraceElement = stackTraceElement2;
        }
        return null;
    }

    static void b() {
        try {
            if (aoov.a("com.google.common.util.StackWalkerCaller") != null) {
                return;
            }
            if (aoov.a("com.google.common.util.JavaLangAccessCaller") == null) {
                throw new UnsatisfiedLinkError("com.google.common.util.Caller is not implemented");
            }
        } catch (LinkageError e) {
        }
    }

    private static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    static Method a() {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod("getStackTraceElement", new Class[]{Throwable.class, Integer.TYPE});
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }
}

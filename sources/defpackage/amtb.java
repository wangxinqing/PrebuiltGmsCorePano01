package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: amtb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amtb {
    private static final Object a;

    static {
        Object a2 = a();
        a = a2;
        if (a2 != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a != null) {
            b();
        }
    }

    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Throwable b(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
                th = cause;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
        }
    }

    public static List c(Throwable th) {
        amrl.a((Object) th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
        }
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        apev.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Method a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private static void b() {
        try {
            Method a2 = a("getStackTraceDepth", Throwable.class);
            if (a2 != null) {
                a2.invoke(a(), new Object[]{new Throwable()});
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e) {
        }
    }

    public static void a(Throwable th) {
        amrl.a((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static void b(Throwable th, Class cls) {
        if (th != null) {
            a(th, cls);
        }
        if (th != null) {
            a(th);
        }
    }

    public static void a(Throwable th, Class cls) {
        amrl.a((Object) th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}

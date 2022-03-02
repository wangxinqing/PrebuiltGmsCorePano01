package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: banm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class banm {
    private final Class a;
    private final String b;
    private final Class[] c;

    public banm(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    private final Method a(Class cls) {
        Class cls2;
        Method a2 = a(cls, this.b, this.c);
        if (a2 == null || (cls2 = this.a) == null || cls2.isAssignableFrom(a2.getReturnType())) {
            return a2;
        }
        return null;
    }

    public final void b(Object obj, Object... objArr) {
        try {
            Method a2 = a((Class) obj.getClass());
            if (a2 != null) {
                try {
                    a2.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                }
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private static Method a(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return a(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException e) {
            }
            return method;
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }

    public final Object a(Object obj, Object... objArr) {
        Method a2;
        try {
            a2 = a((Class) obj.getClass());
            if (a2 != null) {
                return a2.invoke(obj, objArr);
            }
            String str = this.b;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 33 + String.valueOf(valueOf).length());
            sb.append("Method ");
            sb.append(str);
            sb.append(" not supported for object ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } catch (IllegalAccessException e) {
            String valueOf2 = String.valueOf(a2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Unexpectedly could not call: ");
            sb2.append(valueOf2);
            AssertionError assertionError = new AssertionError(sb2.toString());
            assertionError.initCause(e);
            throw assertionError;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean a(Object obj) {
        return a((Class) obj.getClass()) != null;
    }
}

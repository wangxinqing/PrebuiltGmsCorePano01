package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: awac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awac {
    private final Class a;
    private final String b;
    private final Class[] c;

    public awac(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if ((r4.getModifiers() & 1) != 0) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method a(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.b
            java.lang.Class[] r1 = r3.c
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0014 }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0012 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0012:
            r0 = move-exception
            goto L_0x0016
        L_0x0014:
            r4 = move-exception
        L_0x0015:
            r4 = r2
        L_0x0016:
            if (r4 == 0) goto L_0x0027
            java.lang.Class r0 = r3.a
            if (r0 == 0) goto L_0x0027
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0027
            return r2
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awac.a(java.lang.Class):java.lang.reflect.Method");
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

package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: ankp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankp {
    private static final ankr a = ankr.a();

    public static StackTraceElement a(Class cls, Throwable th, int i) {
        StackTraceElement[] stackTraceElementArr;
        ankq.a(cls, "target");
        ankq.a(th, "throwable");
        if (i >= 0) {
            if (a == null) {
                stackTraceElementArr = th.getStackTrace();
            } else {
                stackTraceElementArr = null;
            }
            boolean z = false;
            while (true) {
                try {
                    StackTraceElement a2 = a != null ? a.a(th, i) : stackTraceElementArr[i];
                    if (cls.getName().equals(a2.getClassName())) {
                        z = true;
                    } else if (z) {
                        return a2;
                    }
                    i++;
                } catch (Exception e) {
                    return null;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(42);
            sb.append("skip count cannot be negative: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static StackTraceElement[] b(Class cls, Throwable th, int i) {
        int i2;
        StackTraceElement[] stackTraceElementArr;
        ankq.a(cls, "target");
        ankq.a(th, "throwable");
        if (i <= 0 && i != -1) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("invalid maximum depth: 0");
            throw new IllegalArgumentException(sb.toString());
        }
        ankr ankr = a;
        if (ankr == null) {
            stackTraceElementArr = th.getStackTrace();
            i2 = stackTraceElementArr.length;
        } else {
            try {
                i2 = ((Integer) ankr.b.invoke(ankr.a, new Object[]{th})).intValue();
                stackTraceElementArr = null;
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
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            ankr ankr2 = a;
            StackTraceElement a2 = ankr2 != null ? ankr2.a(th, i3) : stackTraceElementArr[i3];
            if (cls.getName().equals(a2.getClassName())) {
                z = true;
            } else if (z) {
                int i4 = i2 - i3;
                if (i <= 0 || i >= i4) {
                    i = i4;
                }
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
                stackTraceElementArr2[0] = a2;
                for (int i5 = 1; i5 < i; i5++) {
                    ankr ankr3 = a;
                    stackTraceElementArr2[i5] = ankr3 != null ? ankr3.a(th, i3 + i5) : stackTraceElementArr[i3 + i5];
                }
                return stackTraceElementArr2;
            }
        }
        return new StackTraceElement[0];
    }
}

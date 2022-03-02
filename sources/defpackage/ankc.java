package defpackage;

/* renamed from: ankc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankc extends anix {
    public static final anix a = new ankc();

    private ankc() {
    }

    public final anhy a(Class cls, int i) {
        StackTraceElement a2 = ankp.a(cls, new Throwable(), i + 1);
        return a2 != null ? new anks(a2) : anhy.a;
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }

    public final String a(Class cls) {
        StackTraceElement a2 = ankp.a(cls, new Throwable(), 1);
        if (a2 != null) {
            return a2.getClassName();
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() == 0 ? new String("no caller found on the stack for: ") : "no caller found on the stack for: ".concat(valueOf));
    }
}

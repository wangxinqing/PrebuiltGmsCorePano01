package defpackage;

/* renamed from: xdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xdu {
    private static xdu a;

    static {
        xdu.class.getName();
    }

    private xdu() {
    }

    public static synchronized void a() {
        synchronized (xdu.class) {
            if (a == null) {
                a = new xdu();
            }
        }
    }
}

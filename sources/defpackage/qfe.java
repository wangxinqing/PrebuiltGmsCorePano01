package defpackage;

/* renamed from: qfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfe {
    private static int a = 0;
    private static boolean b = false;

    public static synchronized int a() {
        int i;
        synchronized (qfe.class) {
            if (!b) {
                a = jkr.e() ? 1 : 0;
                b = true;
            }
            i = a;
        }
        return i;
    }
}

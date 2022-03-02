package defpackage;

/* renamed from: jdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdc {
    public static jdb a;

    public static synchronized boolean a(jdb jdb) {
        boolean z;
        synchronized (jdc.class) {
            if (a == null) {
                a = jdb;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}

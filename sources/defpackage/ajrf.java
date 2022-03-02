package defpackage;

/* renamed from: ajrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrf {
    public static ajrh a;

    public static synchronized void a() {
        synchronized (ajrf.class) {
            if (a == null) {
                a = new ajrh("NLP");
            }
        }
    }

    public static synchronized void a(ajrg ajrg) {
        synchronized (ajrf.class) {
            if (ajrg == null) {
                a = null;
            }
        }
    }
}

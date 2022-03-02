package defpackage;

/* renamed from: qok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qok {
    private static qok b;
    private final jfc a;

    public qok(jfc jfc) {
        this.a = jfc;
    }

    public static synchronized qok a() {
        qok qok;
        synchronized (qok.class) {
            if (b == null) {
                b = new qok(jfm.a(1, 10));
            }
            qok = b;
        }
        return qok;
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}

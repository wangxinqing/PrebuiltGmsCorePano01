package defpackage;

/* renamed from: glp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class glp {
    private static glp c;
    public long a = -1;
    public final Object b = new Object();

    private glp() {
    }

    public static synchronized glp a() {
        glp glp;
        synchronized (glp.class) {
            if (c == null) {
                c = new glp();
            }
            glp = c;
        }
        return glp;
    }
}

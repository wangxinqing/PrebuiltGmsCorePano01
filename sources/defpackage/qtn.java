package defpackage;

/* renamed from: qtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qtn implements Runnable {
    private final qtp a;

    public qtn(qtp qtp) {
        this.a = qtp;
    }

    public final void run() {
        qtp qtp = this.a;
        if (!qtp.g) {
            int i = qtp.f(qtp.d).getInt("db_version", -1);
            new Object[1][0] = Integer.valueOf(i);
            if (i != 3) {
                qtp.f(qtp.d).edit().putInt("db_version", 3).apply();
                new Object[1][0] = 3;
            }
            qtj.a(qtp.d);
            qtp.g = true;
            qtp.f();
        }
    }
}

package defpackage;

/* renamed from: jfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jfw implements Runnable {
    private final jfx a;

    public jfw(jfx jfx) {
        this.a = jfx;
    }

    public final void run() {
        amkr a2;
        jfx jfx = this.a;
        jfx.b = Thread.currentThread();
        amko amko = jfx.d;
        if (amko == null) {
            jfx.run();
        } else {
            amlv.a(amko, amlw.a);
            try {
                a2 = amlv.a("PooledThread");
                jfx.run();
                if (a2 != null) {
                    a2.close();
                }
                jez.a(jfx.d);
                jfx.d = null;
            } catch (Throwable th) {
                jez.a(jfx.d);
                jfx.d = null;
                throw th;
            }
        }
        jfx.c = true;
        jfx.b = null;
        return;
        throw th;
    }
}

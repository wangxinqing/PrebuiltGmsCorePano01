package defpackage;

/* renamed from: jbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jbd implements Runnable {
    private final jbe a;

    public jbd(jbe jbe) {
        this.a = jbe;
    }

    public final void run() {
        amkr a2;
        amkr a3;
        jbe jbe = this.a;
        try {
            a2 = amlv.a("ServicePostProcessing");
            for (jbl b : jbe.b.g) {
                b.b();
            }
            if (a2 != null) {
                a2.close();
            }
            a3 = amlv.a("GlobalPostProcessing");
            for (jbl b2 : jbf.b) {
                b2.b();
            }
            if (a3 != null) {
                a3.close();
            }
            jbe.b.e.a();
            return;
            throw th;
            throw th;
        } catch (Throwable th) {
            jbe.b.e.a();
            throw th;
        }
    }
}

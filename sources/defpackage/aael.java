package defpackage;

/* renamed from: aael  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aael implements Runnable {
    private final aaen a;
    private final String b;

    public aael(aaen aaen, String str) {
        this.a = aaen;
        this.b = str;
    }

    public final void run() {
        aaen aaen = this.a;
        String str = this.b;
        aaen.c();
        amkr a2 = amlv.a("trigger_EXECUTION_CALLBACK");
        try {
            aaen.b(nxn.EXECUTION_CALLBACK);
            if (a2 != null) {
                a2.close();
            }
            aaen.e.c(str);
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}

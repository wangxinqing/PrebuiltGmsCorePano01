package defpackage;

/* renamed from: edb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class edb implements Runnable {
    private final edf a;
    private final int b;

    public edb(edf edf, int i) {
        this.a = edf;
        this.b = i;
    }

    public final void run() {
        edf edf = this.a;
        int i = this.b;
        edf.g[i] = false;
        edf.b();
        ede ede = edf.e;
        if (ede != null) {
            ede.a(i);
            if (edf.k && !edf.a()) {
                edf.e.a();
            }
        }
    }
}

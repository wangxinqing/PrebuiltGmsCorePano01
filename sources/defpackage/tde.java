package defpackage;

/* renamed from: tde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tde {
    final /* synthetic */ tdf a;
    private final long b;
    private boolean c;
    private final Runnable d = new tdd(this);

    public tde(tdf tdf, long j) {
        this.a = tdf;
        this.b = j;
        this.c = false;
    }

    public final synchronized void a() {
        anil anil = tdf.a;
        if (this.a.c()) {
            tdf tdf = this.a;
            if (tdf.e == 2) {
                tdf.i.postDelayed(this.d, this.b);
            }
        }
        this.c = true;
    }

    public final synchronized void b() {
        anil anil = tdf.a;
        if (this.c) {
            if (this.a.c()) {
                tdf tdf = this.a;
                if (tdf.e == 2) {
                    tdf.i.removeCallbacks(this.d);
                }
            }
            this.c = false;
        }
    }

    public final synchronized boolean c() {
        return this.c;
    }
}

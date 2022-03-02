package defpackage;

/* renamed from: syk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syk implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ sys b;

    public syk(sys sys, long j) {
        this.b = sys;
        this.a = j;
    }

    public final void run() {
        syn syn;
        sys sys = this.b;
        long j = this.a;
        sys.h();
        sys.o();
        sys.E().k.a("Activity resumed, time", Long.valueOf(j));
        syo syo = sys.e;
        syo.b.h();
        if (syo.b.v().a(sud.aw) && (syn = syo.a) != null) {
            syo.b.b.removeCallbacks(syn);
        }
        syq syq = sys.d;
        syq.d.h();
        syq.c.c();
        syq.a = j;
        syq.b = j;
        syr syr = sys.c;
        syr.a.h();
        if (syr.a.x.q()) {
            if (syr.a.v().a(sud.O)) {
                syr.a.w().t.a(false);
            }
            syr.a(syr.a.A().a(), false);
        }
    }
}

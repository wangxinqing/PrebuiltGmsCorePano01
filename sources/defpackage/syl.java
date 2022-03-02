package defpackage;

/* renamed from: syl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syl implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ sys b;

    public syl(sys sys, long j) {
        this.b = sys;
        this.a = j;
    }

    public final void run() {
        sys sys = this.b;
        long j = this.a;
        sys.h();
        sys.o();
        sys.E().k.a("Activity paused, time", Long.valueOf(j));
        syo syo = sys.e;
        if (syo.b.v().a(sud.aw)) {
            syo.a = new syn(syo, syo.b.A().a());
            syo.b.b.postDelayed(syo.a, 2000);
        }
        syq syq = sys.d;
        syq.c.c();
        if (syq.a != 0) {
            syq.d.w().r.a(syq.d.w().r.a() + (j - syq.a));
        }
        syr syr = sys.c;
        if (syr.a.v().a(sud.O)) {
            syr.a.w().t.a(true);
        }
    }
}

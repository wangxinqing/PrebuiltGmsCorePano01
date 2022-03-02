package defpackage;

/* renamed from: ksv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksv implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ kwk b;

    public ksv(kwk kwk, boolean z) {
        this.b = kwk;
        this.a = z;
    }

    public final void run() {
        if (this.a) {
            kwk kwk = this.b;
            ksw ksw = kwk.c;
            long j = kwk.a.m;
            ith ith = ksw.a;
            kov a2 = ksw.d.a(j);
            if (a2 != null) {
                int i = a2.e;
                if (i <= 0) {
                    ksw.a.b("EventDistributor", "Snooze on event without attempts %d", Integer.valueOf(i));
                    i = 1;
                }
                a2.e = i - 1;
                int i2 = a2.f;
                a2.f = i2 + 1;
                double pow = Math.pow((double) ksw.f, (double) i2);
                long j2 = ksw.e;
                long currentTimeMillis = System.currentTimeMillis();
                double d = (double) j2;
                Double.isNaN(d);
                a2.d = currentTimeMillis + ((long) (d * pow));
                a2.t();
                return;
            }
            ksw.a.c("EventDistributor", "Persisted event not found on snooze");
            return;
        }
        kwk kwk2 = this.b;
        ksw ksw2 = kwk2.c;
        kov kov = kwk2.a;
        ksp ksp = kwk2.b;
        ith ith2 = ksw.a;
        ksw2.a(kov, ksp, 0);
    }
}

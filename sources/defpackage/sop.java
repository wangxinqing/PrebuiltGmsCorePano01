package defpackage;

/* renamed from: sop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sop implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ sor c;

    public sop(sor sor, String str, long j) {
        this.c = sor;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        sor sor = this.c;
        String str = this.a;
        long j = this.b;
        sor.i();
        sor.h();
        iva.c(str);
        Integer num = (Integer) sor.b.get(str);
        if (num != null) {
            sxk o = sor.c().o();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                sor.b.remove(str);
                Long l = (Long) sor.a.get(str);
                if (l == null) {
                    sor.E().c.a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    sor.a.remove(str);
                    sor.a(str, j - longValue, o);
                }
                if (sor.b.isEmpty()) {
                    long j2 = sor.c;
                    if (j2 == 0) {
                        sor.E().c.a("First ad exposure time was never set");
                        return;
                    }
                    sor.a(j - j2, o);
                    sor.c = 0;
                    return;
                }
                return;
            }
            sor.b.put(str, Integer.valueOf(intValue));
            return;
        }
        sor.E().c.a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}

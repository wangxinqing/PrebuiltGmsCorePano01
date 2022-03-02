package defpackage;

/* renamed from: awff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awff extends awfc {
    private final amzy b;

    public awff(amzy amzy) {
        this.b = amzy;
    }

    public final awex a(awey awey) {
        amzt j = amzy.j();
        anhk i = this.b.listIterator();
        while (i.hasNext()) {
            awfc awfc = (awfc) i.next();
            try {
                awex a = awfc.a(awey);
                if (a != null) {
                    j.c(a);
                }
            } catch (RuntimeException e) {
                awfj.a(e, awfc, awey);
            }
        }
        amzy a2 = j.a();
        if (a2.isEmpty()) {
            return awex.a;
        }
        if (a2.size() == 1) {
            return new awfg((awex) anbs.b(a2));
        }
        return new awfd(a2);
    }
}

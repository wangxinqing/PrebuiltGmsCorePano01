package defpackage;

/* renamed from: awfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awfe extends awfb {
    private final amzy b;

    public awfe(Iterable iterable) {
        this.b = amzy.a(iterable);
    }

    public final awfc a(Object obj) {
        amzt j = amzy.j();
        anhk i = this.b.listIterator();
        while (i.hasNext()) {
            awfb awfb = (awfb) i.next();
            try {
                awfc a = awfb.a(obj);
                if (a != null) {
                    j.c(a);
                }
            } catch (RuntimeException e) {
                awfj.a(e, awfb, obj);
            }
        }
        amzy a2 = j.a();
        if (a2.isEmpty()) {
            return awfc.a;
        }
        if (a2.size() == 1) {
            return new awfi((awfc) anbs.b(a2));
        }
        return new awff(a2);
    }
}

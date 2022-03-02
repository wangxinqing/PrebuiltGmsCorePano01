package defpackage;

/* renamed from: aezb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aezb implements amqy {
    static final amqy a = new aezb();

    private aezb() {
    }

    public final Object a(Object obj) {
        boolean z;
        auks auks;
        Long l;
        aunj aunj = (aunj) obj;
        auni a2 = auni.a(aunj.c);
        if (a2 == null) {
            a2 = auni.UNKNOWN;
        }
        boolean z2 = false;
        if (a2 != auni.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        auni a3 = auni.a(aunj.c);
        if (a3 == null) {
            a3 = auni.UNKNOWN;
        }
        amrl.a(z, "Invalid change result status %s!", (Object) a3);
        auni a4 = auni.a(aunj.c);
        if (a4 == null) {
            a4 = auni.UNKNOWN;
        }
        if (a4 == auni.ACCEPTED) {
            z2 = true;
        }
        if (aunj.a == 2) {
            auks = (auks) aunj.b;
        } else {
            auks = auks.c;
        }
        if ((auks.a & 1) != 0) {
            l = Long.valueOf(auks.b);
        } else {
            l = null;
        }
        return new aesq(z2, l);
    }
}

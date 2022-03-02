package defpackage;

/* renamed from: afgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgj {
    public static aums a(aums aums, aump aump) {
        boolean z;
        aucd aucd = (aucd) aums.c(5);
        aucd.a((aucj) aums);
        boolean z2 = false;
        if (aums.b || aump.f) {
            z = true;
        } else {
            z = false;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aums aums2 = (aums) aucd.b;
        aums aums3 = aums.e;
        int i = aums2.a | 1;
        aums2.a = i;
        aums2.b = z;
        if (aums.c || aump.g) {
            z2 = true;
        }
        aums2.a = i | 2;
        aums2.c = z2;
        return (aums) aucd.i();
    }

    public static aums a(aums aums, aums aums2) {
        boolean z;
        aubn aubn;
        if (aums == null) {
            return aums2;
        }
        aucd o = aums.e.o();
        boolean z2 = true;
        if (!aums.b || !aums2.b) {
            z = false;
        } else {
            z = true;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aums aums3 = (aums) o.b;
        int i = aums3.a | 1;
        aums3.a = i;
        aums3.b = z;
        if (!aums.c || !aums2.c) {
            z2 = false;
        }
        aums3.a = i | 2;
        aums3.c = z2;
        aubn aubn2 = aums.d;
        if (aubn2 == null) {
            aubn2 = aubn.c;
        }
        aubn aubn3 = aums2.d;
        if (aubn3 == null) {
            aubn3 = aubn.c;
        }
        if (augi.a.compare(aubn2, aubn3) >= 0 ? (aubn = aums2.d) == null : (aubn = aums.d) == null) {
            aubn = aubn.c;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aums aums4 = (aums) o.b;
        aubn.getClass();
        aums4.d = aubn;
        aums4.a |= 4;
        return (aums) o.i();
    }
}

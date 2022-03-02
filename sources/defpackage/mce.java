package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: mce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mce {
    public final mcd a;
    public final ClientContext b;
    public final ameb c;
    public amea d;

    public mce(mcd mcd, ClientContext clientContext, aubq aubq, audx audx) {
        this.a = mcd;
        this.b = clientContext;
        aucd o = ameb.d.o();
        aucf aucf = (aucf) amdy.a.o();
        aucf.a(aubq, audx);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ameb ameb = (ameb) o.b;
        amdy amdy = (amdy) aucf.i();
        amdy.getClass();
        ameb.c = amdy;
        ameb.a |= 2;
        int a2 = aubq.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ameb ameb2 = (ameb) o.b;
        ameb2.a |= 1;
        ameb2.b = a2;
        this.c = (ameb) o.i();
    }

    public final audx a(aubq aubq) {
        amea amea = this.d;
        if (amea == null || (amea.a & 1) == 0) {
            return null;
        }
        amdz amdz = amea.b;
        if (amdz == null) {
            amdz = amdz.a;
        }
        auci auci = (auci) aubq;
        amdz.a(auci);
        Object b2 = amdz.m.b(auci.d);
        if (b2 == null) {
            b2 = auci.b;
        } else {
            auci.a(b2);
        }
        return (audx) b2;
    }
}

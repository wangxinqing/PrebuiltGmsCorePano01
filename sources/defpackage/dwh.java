package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: dwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwh {
    private final dwg a;
    private final ClientContext b;
    private final ameb c;
    private amea d;

    public dwh(dwg dwg, ClientContext clientContext, aubq aubq, audx audx) {
        this.a = dwg;
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

    public final void b() {
        dwg dwg = this.a;
        ClientContext clientContext = this.b;
        ameb ameb = this.c;
        String str = clientContext.f;
        this.d = (amea) dwg.a.a(dwg.a(), ameb.k(), (Object) amea.d, str, jhg.h(dwg.a.i, str));
    }

    public final boolean c() {
        amea amea = this.d;
        return (amea == null || (amea.a & 2) == 0) ? false : true;
    }

    public final String d() {
        amea amea = this.d;
        if (amea == null || (amea.a & 2) == 0) {
            return null;
        }
        atip atip = amea.c;
        if (atip == null) {
            atip = atip.c;
        }
        return atip.b;
    }

    public final int e() {
        amea amea = this.d;
        if (amea == null || (amea.a & 2) == 0) {
            return 0;
        }
        atip atip = amea.c;
        if (atip == null) {
            atip = atip.c;
        }
        return atip.a;
    }

    public final void a() {
        dwg dwg = this.a;
        ClientContext clientContext = this.b;
        ameb ameb = this.c;
        this.d = (amea) dwg.a.a(clientContext, 1, dwg.a(), ameb.k(), (Object) amea.d);
    }
}

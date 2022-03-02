package defpackage;

import com.google.android.gms.libs.vcdiff.VcDiffEncoderDecoder;

/* renamed from: aeza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aeza implements amqy {
    private final aeyi a;

    public aeza(aeyi aeyi) {
        this.a = aeyi;
    }

    public final Object a(Object obj) {
        aeth aeth;
        aukq aukq;
        aeyi aeyi = this.a;
        aukc aukc = (aukc) obj;
        int a2 = aukb.a(aukc.d);
        if (a2 == 0 || a2 != 3 || aukc.b != 4 || (aeth = (aeth) aeyi.a.a(((aukq) aukc.c).c)) == null) {
            return aukc;
        }
        try {
            aucd o = aukc.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aukc aukc2 = (aukc) o.b;
            aukc2.d = 2;
            aukc2.a |= 1;
            if (aukc.b == 4) {
                aukq = (aukq) aukc.c;
            } else {
                aukq = aukq.f;
            }
            auay a3 = aeyi.a(aeth.b());
            amrl.a(a3.equals(aukq.c), (Object) "Can't compute diff between footprints with different secondary ids!");
            byte[] b = VcDiffEncoderDecoder.b(aeth.a(), aukq.d.k());
            aucd o2 = aukr.h.o();
            long longValue = aeth.c().longValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aukr aukr = (aukr) o2.b;
            aukr.a |= 1;
            aukr.b = longValue;
            aukp aukp = aukq.e;
            if (aukp == null) {
                aukp = aukp.c;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aukr aukr2 = (aukr) o2.b;
            aukp.getClass();
            aukr2.g = aukp;
            aukr2.a |= 32;
            auay a4 = auay.a(b);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aukr aukr3 = (aukr) o2.b;
            a4.getClass();
            aukr3.a |= 8;
            aukr3.e = a4;
            auay a5 = aeuz.a(aukq);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aukr aukr4 = (aukr) o2.b;
            a5.getClass();
            aukr4.a |= 16;
            aukr4.f = a5;
            if (aeth.b() != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aukr aukr5 = (aukr) o2.b;
                a3.getClass();
                aukr5.a = 4 | aukr5.a;
                aukr5.d = a3;
            }
            aukr aukr6 = (aukr) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aukc aukc3 = (aukc) o.b;
            aukr6.getClass();
            aukc3.c = aukr6;
            aukc3.b = 6;
            return (aukc) o.i();
        } catch (rbp e) {
            throw new aetm(e);
        } catch (aetm e2) {
            pia pia = (pia) aeyi.b.a();
            ((pdg) aeyi.c.a()).a("Failed to encode footprint payload!", e2);
            return aukc;
        }
    }
}

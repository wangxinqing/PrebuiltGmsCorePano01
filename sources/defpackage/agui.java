package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agui implements aoqa {
    final List a = new ArrayList();
    long b = -1;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    final /* synthetic */ aguj g;
    final afts h = new afts();

    public agui(aguj aguj) {
        this.g = aguj;
    }

    public final aorr a() {
        return aopr.a(agok.a(((afym) this.g.g.a()).a(), "FootprintsUploadBufferImpl"), (aoqb) new agtw(this), this.g.c);
    }

    public final aorr b() {
        return aopr.a(this.g.b.a(), (aoqb) new agtz(this), this.g.c);
    }

    public final atwd c() {
        aucd o = atwd.h.o();
        int a2 = (int) osi.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atwd atwd = (atwd) o.b;
        int i = atwd.a | 1;
        atwd.a = i;
        atwd.b = a2;
        int i2 = this.c;
        int i3 = i | 2;
        atwd.a = i3;
        atwd.c = i2;
        int i4 = this.d;
        int i5 = i3 | 4;
        atwd.a = i5;
        atwd.e = i4;
        int i6 = this.e;
        int i7 = i5 | 8;
        atwd.a = i7;
        atwd.f = i6;
        int i8 = this.f;
        atwd.a = i7 | 16;
        atwd.g = i8;
        if (this.b != -1) {
            List list = this.a;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                aucd o2 = atwc.c.o();
                long longValue = this.b - ((Long) list.get(i9)).longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                atwc atwc = (atwc) o2.b;
                atwc.a |= 1;
                atwc.b = longValue;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atwd atwd2 = (atwd) o.b;
                atwc atwc2 = (atwc) o2.i();
                atwc2.getClass();
                if (!atwd2.d.a()) {
                    atwd2.d = aucj.a(atwd2.d);
                }
                atwd2.d.add(atwc2);
            }
        }
        return (atwd) o.i();
    }

    public final aorr a(aorr aorr, afyl afyl) {
        return aopr.a(aooz.a((aorr) aoqw.c(aorr), Exception.class, (aoqb) new aguc(this, afyl), this.g.c), (amqy) new agud(this, afyl), this.g.c);
    }
}

package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: jti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jti {
    public final aucd a;
    private final List b;

    public jti(int i, int i2, int i3) {
        int a2 = atjo.a(i);
        a2 = a2 == 0 ? 1 : a2;
        int a3 = atjk.a(i3);
        a3 = a3 == 0 ? 1 : a3;
        aucd o = atjl.k.o();
        String uuid = UUID.randomUUID().toString();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atjl atjl = (atjl) o.b;
        uuid.getClass();
        int i4 = atjl.a | 1;
        atjl.a = i4;
        atjl.b = uuid;
        atjl.d = a2 - 1;
        atjl.a = i4 | 4;
        atjv b2 = jtj.b(i2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atjl atjl2 = (atjl) o.b;
        atjl2.e = b2.bA;
        int i5 = atjl2.a | 8;
        atjl2.a = i5;
        atjl2.f = a3 - 1;
        atjl2.a = i5 | 16;
        long currentTimeMillis = System.currentTimeMillis();
        aucd o2 = atjw.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atjw atjw = (atjw) o2.b;
        int i6 = 1 | atjw.a;
        atjw.a = i6;
        atjw.b = currentTimeMillis;
        int i7 = i6 | 2;
        atjw.a = i7;
        atjw.c = currentTimeMillis;
        atjw.a = i7 | 4;
        atjw.d = 0;
        atjw atjw2 = (atjw) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atjl atjl3 = (atjl) o.b;
        atjw2.getClass();
        atjl3.c = atjw2;
        atjl3.a |= 2;
        this.a = o;
        this.b = new ArrayList();
    }

    public final ContextData a() {
        aucd aucd = this.a;
        if ((((atjl) aucd.b).a & 32) == 0) {
            atmb c = jut.c(System.currentTimeMillis());
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            atjl atjl = (atjl) aucd.b;
            atjl atjl2 = atjl.k;
            c.getClass();
            atjl.g = c;
            atjl.a |= 32;
        }
        if (this.b.size() > 0) {
            aucd aucd2 = this.a;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            atjl atjl3 = atjl.k;
            ((atjl) aucd2.b).i = aucj.s();
            List list = this.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            atjl atjl4 = (atjl) aucd2.b;
            if (!atjl4.i.a()) {
                atjl4.i = aucj.a(atjl4.i);
            }
            auab.a((Iterable) list, (List) atjl4.i);
        }
        return new ContextData((atjl) this.a.i());
    }

    public final void a(long j) {
        boolean z;
        atmb atmb = ((atjl) this.a.b).g;
        if (atmb == null) {
            atmb = atmb.e;
        }
        aucd aucd = (aucd) atmb.c(5);
        aucd.a((aucj) atmb);
        int a2 = atma.a(((atmb) aucd.b).b);
        if (a2 == 0) {
            a2 = 3;
        }
        if (a2 == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atmb atmb2 = (atmb) aucd.b;
        atmb2.b = 3;
        int i = atmb2.a | 1;
        atmb2.a = i;
        atmb2.a = i | 4;
        atmb2.d = j;
        aucd aucd2 = this.a;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        atjl atjl = (atjl) aucd2.b;
        atmb atmb3 = (atmb) aucd.i();
        atjl atjl2 = atjl.k;
        atmb3.getClass();
        atjl.g = atmb3;
        atjl.a |= 32;
    }

    public jti(ContextData contextData) {
        iva.a((Object) contextData);
        int a2 = atjo.a(contextData.f());
        int a3 = atjk.a(contextData.i());
        a3 = a3 == 0 ? 1 : a3;
        a2 = a2 == 0 ? 1 : a2;
        aucd o = atjl.k.o();
        String d = contextData.d();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atjl atjl = (atjl) o.b;
        d.getClass();
        int i = atjl.a | 1;
        atjl.a = i;
        atjl.b = d;
        atjl.d = a2 - 1;
        atjl.a = i | 4;
        atjv h = contextData.h();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atjl atjl2 = (atjl) o.b;
        atjl2.e = h.bA;
        int i2 = atjl2.a | 8;
        atjl2.a = i2;
        atjl2.f = a3 - 1;
        atjl2.a = i2 | 16;
        int[] iArr = ContextData.a;
        atjw atjw = contextData.b.c;
        atjw = atjw == null ? atjw.g : atjw;
        long currentTimeMillis = System.currentTimeMillis();
        aucd aucd = (aucd) atjw.c(5);
        aucd.a((aucj) atjw);
        int i3 = atjw.d + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atjw atjw2 = (atjw) aucd.b;
        int i4 = atjw2.a | 4;
        atjw2.a = i4;
        atjw2.d = i3;
        atjw2.a = i4 | 2;
        atjw2.c = currentTimeMillis;
        atjw atjw3 = (atjw) aucd.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atjl atjl3 = (atjl) o.b;
        atjw3.getClass();
        atjl3.c = atjw3;
        atjl3.a |= 2;
        atmb atmb = contextData.b.g;
        atmb = atmb == null ? atmb.e : atmb;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atjl atjl4 = (atjl) o.b;
        atmb.getClass();
        atjl4.g = atmb;
        atjl4.a |= 32;
        this.a = o;
        atjl atjl5 = contextData.b;
        iva.a((Object) o);
        iva.a((Object) atjl5);
        if ((atjl5.a & 64) != 0) {
            atjm atjm = atjl5.h;
            atjm = atjm == null ? atjm.a : atjm;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atjl atjl6 = (atjl) o.b;
            atjm.getClass();
            atjl6.h = atjm;
            atjl6.a |= 64;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            atjl atjl7 = (atjl) o.b;
            atjl7.h = null;
            atjl7.a &= -65;
        }
        this.b = new ArrayList(contextData.b.i);
    }

    public final void a(aubq aubq, Object obj) {
        aucd aucd = this.a;
        aucf aucf = (aucf) atjm.a.o();
        aucf.a(aubq, obj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atjl atjl = (atjl) aucd.b;
        atjm atjm = (atjm) aucf.i();
        atjl atjl2 = atjl.k;
        atjm.getClass();
        atjl.h = atjm;
        atjl.a |= 64;
    }

    public final void a(jun jun) {
        iva.a((Object) jun);
        aucd aucd = this.a;
        atkq atkq = jun.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atjl atjl = (atjl) aucd.b;
        atjl atjl2 = atjl.k;
        atkq.getClass();
        atjl.j = atkq;
        atjl.a |= 128;
    }

    public final void a(jut jut) {
        iva.a((Object) jut);
        aucd aucd = this.a;
        atmb atmb = jut.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atjl atjl = (atjl) aucd.b;
        atjl atjl2 = atjl.k;
        atmb.getClass();
        atjl.g = atmb;
        atjl.a |= 32;
    }
}

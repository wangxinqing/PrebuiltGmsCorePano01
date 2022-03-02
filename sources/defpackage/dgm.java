package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: dgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dgm {
    private final dfd a;
    private final HashMap b = new HashMap();
    private final dgl c;

    public dgm(Context context, dfd dfd) {
        dgl dgl = new dgl(context);
        this.a = dfd;
        this.c = dgl;
    }

    public final dis a() {
        dih b2 = this.a.b();
        if (this.b.containsKey(b2)) {
            return (dis) this.b.get(b2);
        }
        dis a2 = dis.a(this.c.a, b2);
        this.b.put(b2, a2);
        return a2;
    }

    public final void a(int i, int i2, int i3) {
        dis a2 = a();
        aucd o = aqna.d.o();
        aucf aucf = (aucf) aqmz.l.o();
        aucd o2 = aqlr.f.o();
        aucd o3 = aqmr.k.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqmr aqmr = (aqmr) o3.b;
        aqmr.b = i3 - 1;
        int i4 = aqmr.a | 1;
        aqmr.a = i4;
        int i5 = i4 | 2;
        aqmr.a = i5;
        aqmr.c = i;
        aqmr.a = i5 | 4;
        aqmr.d = i2;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqlr aqlr = (aqlr) o2.b;
        aqmr aqmr2 = (aqmr) o3.i();
        aqmr2.getClass();
        aqlr.e = aqmr2;
        aqlr.a |= 8;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqlr aqlr2 = (aqlr) o2.i();
        aqlr2.getClass();
        aqmz.k = aqlr2;
        aqmz.a |= 2048;
        aqlq a3 = a2.a();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz2 = (aqmz) aucf.b;
        a3.getClass();
        aqmz2.h = a3;
        aqmz2.a |= 64;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz aqmz3 = (aqmz) aucf.i();
        aqmz3.getClass();
        aqna.b = aqmz3;
        aqna.a |= 1;
        aucd o4 = aqmx.c.o();
        aucd o5 = aqmv.f.o();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqmv aqmv = (aqmv) o5.b;
        aqmv.b = 3;
        aqmv.a |= 1;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqmx aqmx = (aqmx) o4.b;
        aqmv aqmv2 = (aqmv) o5.i();
        aqmv2.getClass();
        aqmx.b = aqmv2;
        aqmx.a |= 8;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna2 = (aqna) o.b;
        aqmx aqmx2 = (aqmx) o4.i();
        aqmx2.getClass();
        aqna2.c = aqmx2;
        aqna2.a |= 8;
        a2.a((aqna) o.i());
    }

    public final void a(int i, int i2, int i3, int i4) {
        dis a2 = a();
        aucd o = aqna.d.o();
        aucd o2 = aqmx.c.o();
        aucd o3 = aqmv.f.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqmv aqmv = (aqmv) o3.b;
        aqmv.b = 3;
        aqmv.a |= 1;
        aucd o4 = aqnc.k.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqnc aqnc = (aqnc) o4.b;
        int i5 = aqnc.a | 1;
        aqnc.a = i5;
        aqnc.b = i;
        int i6 = i5 | 2;
        aqnc.a = i6;
        aqnc.c = i2;
        int i7 = i6 | 4;
        aqnc.a = i7;
        aqnc.d = i3;
        aqnc.a = i7 | 8;
        aqnc.e = i4;
        int c2 = a2.c();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqnc aqnc2 = (aqnc) o4.b;
        aqnc2.j = c2 - 1;
        aqnc2.a |= 1024;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqmv aqmv2 = (aqmv) o3.b;
        aqnc aqnc3 = (aqnc) o4.i();
        aqnc3.getClass();
        aqmv2.d = aqnc3;
        aqmv2.a |= 4;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqmx aqmx = (aqmx) o2.b;
        aqmv aqmv3 = (aqmv) o3.i();
        aqmv3.getClass();
        aqmx.b = aqmv3;
        aqmx.a |= 8;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmx aqmx2 = (aqmx) o2.i();
        aqmx2.getClass();
        aqna.c = aqmx2;
        aqna.a |= 8;
        a2.a((aqna) o.i());
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        dis a2 = a();
        aucd o = aqna.d.o();
        aucf aucf = (aucf) aqmz.l.o();
        aucd o2 = aqlr.f.o();
        aucd o3 = aqmr.k.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqmr aqmr = (aqmr) o3.b;
        aqmr.b = i5 - 1;
        int i6 = aqmr.a | 1;
        aqmr.a = i6;
        int i7 = i6 | 2;
        aqmr.a = i7;
        aqmr.c = i;
        int i8 = i7 | 4;
        aqmr.a = i8;
        aqmr.d = i2;
        int i9 = i8 | 8;
        aqmr.a = i9;
        aqmr.e = i3;
        aqmr.a = i9 | 16;
        aqmr.f = i4;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqlr aqlr = (aqlr) o2.b;
        aqmr aqmr2 = (aqmr) o3.i();
        aqmr2.getClass();
        aqlr.e = aqmr2;
        aqlr.a |= 8;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqlr aqlr2 = (aqlr) o2.i();
        aqlr2.getClass();
        aqmz.k = aqlr2;
        aqmz.a |= 2048;
        aqlq a3 = a2.a();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz2 = (aqmz) aucf.b;
        a3.getClass();
        aqmz2.h = a3;
        aqmz2.a |= 64;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz aqmz3 = (aqmz) aucf.i();
        aqmz3.getClass();
        aqna.b = aqmz3;
        aqna.a |= 1;
        aucd o4 = aqmx.c.o();
        aucd o5 = aqmv.f.o();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqmv aqmv = (aqmv) o5.b;
        aqmv.b = 3;
        aqmv.a |= 1;
        aucd o6 = aqmy.j.o();
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqmy aqmy = (aqmy) o6.b;
        int i10 = aqmy.a | 1;
        aqmy.a = i10;
        aqmy.b = i;
        int i11 = i10 | 2;
        aqmy.a = i11;
        aqmy.c = i2;
        int i12 = i11 | 4;
        aqmy.a = i12;
        aqmy.d = i3;
        aqmy.a = i12 | 8;
        aqmy.e = i4;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqmv aqmv2 = (aqmv) o5.b;
        aqmy aqmy2 = (aqmy) o6.i();
        aqmy2.getClass();
        aqmv2.c = aqmy2;
        aqmv2.a |= 2;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqmx aqmx = (aqmx) o4.b;
        aqmv aqmv3 = (aqmv) o5.i();
        aqmv3.getClass();
        aqmx.b = aqmv3;
        aqmx.a |= 8;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna2 = (aqna) o.b;
        aqmx aqmx2 = (aqmx) o4.i();
        aqmx2.getClass();
        aqna2.c = aqmx2;
        aqna2.a |= 8;
        a2.a((aqna) o.i());
    }

    public final void a(aqsr aqsr, aqsr aqsr2, int i) {
        dis a2 = a();
        aucd o = aqmr.k.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqmr aqmr = (aqmr) o.b;
        aqmr.b = i - 1;
        int i2 = aqmr.a | 1;
        aqmr.a = i2;
        int i3 = aqsr.b;
        int i4 = i2 | 2;
        aqmr.a = i4;
        aqmr.c = i3;
        int i5 = aqsr2.b;
        aqmr.a = i4 | 4;
        aqmr.d = i5;
        aucd o2 = aqmy.j.o();
        int i6 = aqsr.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqmy aqmy = (aqmy) o2.b;
        int i7 = aqmy.a | 1;
        aqmy.a = i7;
        aqmy.b = i6;
        int i8 = aqsr2.b;
        aqmy.a = i7 | 2;
        aqmy.c = i8;
        int a3 = csp.a(Collections.unmodifiableMap(aqsr.c));
        if (a3 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmr aqmr2 = (aqmr) o.b;
            aqmr2.a |= 128;
            aqmr2.g = a3;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmy aqmy2 = (aqmy) o2.b;
            aqmy2.a |= 64;
            aqmy2.f = a3;
        }
        int a4 = csp.a(Collections.unmodifiableMap(aqsr2.c));
        if (a4 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmr aqmr3 = (aqmr) o.b;
            aqmr3.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aqmr3.h = a4;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmy aqmy3 = (aqmy) o2.b;
            aqmy3.a |= 128;
            aqmy3.g = a4;
        }
        int b2 = csp.b(Collections.unmodifiableMap(aqsr.c));
        if (b2 != -1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmr aqmr4 = (aqmr) o.b;
            aqmr4.a |= 512;
            aqmr4.i = b2;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmy aqmy4 = (aqmy) o2.b;
            aqmy4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aqmy4.h = b2;
        }
        int b3 = csp.b(Collections.unmodifiableMap(aqsr2.c));
        if (b3 != -1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmr aqmr5 = (aqmr) o.b;
            aqmr5.a |= 1024;
            aqmr5.j = b3;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmy aqmy5 = (aqmy) o2.b;
            aqmy5.a |= 512;
            aqmy5.i = b3;
        }
        aucd o3 = aqna.d.o();
        aucf aucf = (aucf) aqmz.l.o();
        aucd o4 = aqlr.f.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqlr aqlr = (aqlr) o4.b;
        aqmr aqmr6 = (aqmr) o.i();
        aqmr6.getClass();
        aqlr.e = aqmr6;
        aqlr.a |= 8;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqlr aqlr2 = (aqlr) o4.i();
        aqlr2.getClass();
        aqmz.k = aqlr2;
        aqmz.a |= 2048;
        aqlq a5 = a2.a();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz2 = (aqmz) aucf.b;
        a5.getClass();
        aqmz2.h = a5;
        aqmz2.a |= 64;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqna aqna = (aqna) o3.b;
        aqmz aqmz3 = (aqmz) aucf.i();
        aqmz3.getClass();
        aqna.b = aqmz3;
        aqna.a |= 1;
        aucd o5 = aqmx.c.o();
        aucd o6 = aqmv.f.o();
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqmv aqmv = (aqmv) o6.b;
        aqmv.b = 3;
        aqmv.a |= 1;
        aqmy aqmy6 = (aqmy) o2.i();
        aqmy6.getClass();
        aqmv.c = aqmy6;
        aqmv.a |= 2;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqmx aqmx = (aqmx) o5.b;
        aqmv aqmv2 = (aqmv) o6.i();
        aqmv2.getClass();
        aqmx.b = aqmv2;
        aqmx.a |= 8;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqna aqna2 = (aqna) o3.b;
        aqmx aqmx2 = (aqmx) o5.i();
        aqmx2.getClass();
        aqna2.c = aqmx2;
        aqna2.a |= 8;
        a2.a((aqna) o3.i());
    }
}

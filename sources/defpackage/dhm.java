package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;

/* renamed from: dhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dhm {
    public final dfd a;
    public final dhe b;
    public final dhl c;
    public final dgm d;

    public dhm(dfd dfd, dhe dhe, dhl dhl, dgm dgm) {
        this.a = dfd;
        this.b = dhe;
        this.c = dhl;
        this.d = dgm;
    }

    public final void a() {
        this.b.a(dhd.BACK);
    }

    public final void b() {
        this.b.a();
    }

    public final dih c() {
        return this.a.b();
    }

    public final cvm d() {
        return this.a.e;
    }

    public final void e() {
        this.a.a();
    }

    public final void a(aqsr aqsr) {
        this.a.a(aqsr);
    }

    public final void b(aqsr aqsr, aqsr aqsr2) {
        dis a2 = this.d.a();
        aucd o = aqnc.k.o();
        int i = aqsr.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqnc aqnc = (aqnc) o.b;
        int i2 = aqnc.a | 1;
        aqnc.a = i2;
        aqnc.b = i;
        int i3 = aqsr2.b;
        aqnc.a = i2 | 2;
        aqnc.c = i3;
        int c2 = a2.c();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqnc aqnc2 = (aqnc) o.b;
        aqnc2.j = c2 - 1;
        aqnc2.a |= 1024;
        int a3 = csp.a(Collections.unmodifiableMap(aqsr.c));
        if (a3 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqnc aqnc3 = (aqnc) o.b;
            aqnc3.a |= 64;
            aqnc3.f = a3;
        }
        int a4 = csp.a(Collections.unmodifiableMap(aqsr2.c));
        if (a4 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqnc aqnc4 = (aqnc) o.b;
            aqnc4.a |= 128;
            aqnc4.g = a4;
        }
        int b2 = csp.b(Collections.unmodifiableMap(aqsr.c));
        if (b2 != -1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqnc aqnc5 = (aqnc) o.b;
            aqnc5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aqnc5.h = b2;
        }
        int b3 = csp.b(Collections.unmodifiableMap(aqsr2.c));
        if (b3 != -1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqnc aqnc6 = (aqnc) o.b;
            aqnc6.a |= 512;
            aqnc6.i = b3;
        }
        aucd o2 = aqna.d.o();
        aucd o3 = aqmx.c.o();
        aucd o4 = aqmv.f.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqmv aqmv = (aqmv) o4.b;
        aqmv.b = 3;
        aqmv.a |= 1;
        aqnc aqnc7 = (aqnc) o.i();
        aqnc7.getClass();
        aqmv.d = aqnc7;
        aqmv.a |= 4;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqmx aqmx = (aqmx) o3.b;
        aqmv aqmv2 = (aqmv) o4.i();
        aqmv2.getClass();
        aqmx.b = aqmv2;
        aqmx.a |= 8;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqna aqna = (aqna) o2.b;
        aqmx aqmx2 = (aqmx) o3.i();
        aqmx2.getClass();
        aqna.c = aqmx2;
        aqna.a |= 8;
        a2.a((aqna) o2.i());
    }

    public final void a(aqsr aqsr, aqsr aqsr2) {
        dis a2 = this.d.a();
        aucd o = aqmk.h.o();
        int i = aqsr.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqmk aqmk = (aqmk) o.b;
        int i2 = aqmk.a | 1;
        aqmk.a = i2;
        aqmk.b = i;
        int i3 = aqsr2.b;
        aqmk.a = i2 | 2;
        aqmk.c = i3;
        int a3 = csp.a(Collections.unmodifiableMap(aqsr.c));
        if (a3 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmk aqmk2 = (aqmk) o.b;
            aqmk2.a |= 16;
            aqmk2.d = a3;
        }
        int a4 = csp.a(Collections.unmodifiableMap(aqsr2.c));
        if (a4 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmk aqmk3 = (aqmk) o.b;
            aqmk3.a |= 32;
            aqmk3.e = a4;
        }
        int b2 = csp.b(Collections.unmodifiableMap(aqsr.c));
        if (b2 != -1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmk aqmk4 = (aqmk) o.b;
            aqmk4.a |= 64;
            aqmk4.f = b2;
        }
        int b3 = csp.b(Collections.unmodifiableMap(aqsr2.c));
        if (b3 != -1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqmk aqmk5 = (aqmk) o.b;
            aqmk5.a |= 128;
            aqmk5.g = b3;
        }
        aucd o2 = aqna.d.o();
        aucf aucf = (aucf) aqmz.l.o();
        aucd o3 = aqlr.f.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqlr aqlr = (aqlr) o3.b;
        aqmk aqmk6 = (aqmk) o.i();
        aqmk6.getClass();
        aqlr.c = aqmk6;
        aqlr.a |= 2;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqlr aqlr2 = (aqlr) o3.i();
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
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqna aqna = (aqna) o2.b;
        aqmz aqmz3 = (aqmz) aucf.i();
        aqmz3.getClass();
        aqna.b = aqmz3;
        aqna.a |= 1;
        a2.a((aqna) o2.i());
    }
}

package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: auja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auja extends aucd implements audy {
    public auja() {
        super((aucj) aujb.y);
    }

    @Deprecated
    public final void D(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.a |= 131072;
        aujb.r = i;
    }

    public final void E(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.q = i - 2;
        aujb.a |= 65536;
    }

    public final void F(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.p = i - 2;
        aujb.a |= 32768;
    }

    public final void G(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.c = i - 2;
        aujb.a |= 2;
    }

    public final void H(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.o = i - 1;
        aujb.a |= 16384;
    }

    public final void I(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.b = i - 2;
        aujb.a |= 1;
    }

    public final void a(float f) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        aujb.m = f;
    }

    public final void b(float f) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.a |= 128;
        aujb.i = f;
    }

    @Deprecated
    public final void q(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        str.getClass();
        aujb.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        aujb.n = str;
    }

    public final void r(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        str.getClass();
        aujb.a |= 8;
        aujb.e = str;
    }

    public final void a(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujb.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aujb.j = i;
    }

    public final void b(auip auip) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        auip.getClass();
        aujb.l = auip;
        aujb.a |= 2048;
    }

    public final void a(auip auip) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        auip.getClass();
        aujb.k = auip;
        aujb.a |= 512;
    }

    @Deprecated
    public final void b(auir auir) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        auir.getClass();
        aujb.g = auir;
        aujb.a |= 32;
    }

    public final void a(auir auir) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        auir.getClass();
        aujb.f = auir;
        aujb.a |= 16;
    }

    public final void a(auis auis) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        auis.getClass();
        aujb.h = auis;
        aujb.a |= 64;
    }

    public final void a(auiz auiz) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        auiz.getClass();
        aujb.s = auiz;
        aujb.a |= 262144;
    }

    public final void a(aujg aujg) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujg.getClass();
        if (!aujb.u.a()) {
            aujb.u = aucj.a(aujb.u);
        }
        aujb.u.d(aujg.k);
    }

    public final void a(aujh aujh) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujh.getClass();
        if (!aujb.x.a()) {
            aujb.x = aucj.a(aujb.x);
        }
        aujb.x.add(aujh);
    }

    public final void a(aujm aujm) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujm.getClass();
        aujb.c();
        aujb.v.add(aujm);
    }

    public final void a(aujq aujq) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        aujq.getClass();
        aujb.e();
        aujb.w.add(aujq);
    }

    public final void a(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        aujb aujb = (aujb) this.b;
        aujb aujb2 = aujb.y;
        str.getClass();
        aujb.a |= 524288;
        aujb.t = str;
    }
}

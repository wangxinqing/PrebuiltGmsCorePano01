package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: owx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owx {
    public final String a;
    public final ppp b;
    public final Queue c = new ArrayDeque();
    public oww d = null;
    public final boolean e;
    private int f = 0;

    public owx(ppp ppp, String str, boolean z) {
        this.a = str;
        this.b = ppp;
        this.e = z;
    }

    public final synchronized void a(oww oww) {
        boolean z;
        boolean z2 = true;
        if (this.d == oww) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int i = oww.c;
        if (this.f < i) {
            z2 = false;
        }
        iva.a(z2);
        this.f -= i;
    }

    public final synchronized void a(oww oww, long j) {
        boolean z;
        if (this.d == oww) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        this.b.a(oww.a(4), j);
    }

    public final boolean a(aonk aonk, owt owt, boolean z) {
        oww oww = new oww(aonk, owt, z, 1, this);
        int intValue = ((Integer) ozx.aG.c()).intValue();
        int i = oww.c;
        synchronized (this) {
            int i2 = this.f + i;
            if (i2 > intValue) {
                return false;
            }
            this.f = i2;
            if (this.d != null) {
                this.c.add(oww);
                return true;
            }
            this.d = oww;
            this.b.d(oww.b());
            return true;
        }
    }
}

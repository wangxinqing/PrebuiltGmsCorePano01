package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: uuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uuh {
    private final uvf a;
    private final Map b = new nz();
    private final Map c = new nz();
    private final Map d = new nz();
    private int e = 1;
    private byte[] f;

    public uuh(uvf uvf) {
        this.a = uvf;
        this.f = uvf.d();
    }

    private final void b() {
        if (!Arrays.equals(this.f, this.a.d())) {
            jjg jjg = ulh.a;
            this.f = this.a.d();
            this.e = 1;
            this.b.clear();
            this.c.clear();
            this.d.clear();
        }
    }

    private final uuf f(short s) {
        b();
        Map map = this.c;
        Short valueOf = Short.valueOf(s);
        uuf uuf = (uuf) map.get(valueOf);
        if (uuf != null) {
            return uuf;
        }
        uuf uuf2 = new uuf();
        this.c.put(valueOf, uuf2);
        return uuf2;
    }

    private final uug g(short s) {
        b();
        Map map = this.b;
        Short valueOf = Short.valueOf(s);
        uug uug = (uug) map.get(valueOf);
        if (uug != null) {
            return uug;
        }
        uug uug2 = new uug();
        this.b.put(valueOf, uug2);
        return uug2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int a() {
        int i;
        b();
        i = this.e;
        this.e = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(short s) {
        jjg jjg = ulh.a;
        this.c.remove(Short.valueOf(s));
        g(s).a = false;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d(short s) {
        jjg jjg = ulh.a;
        this.b.remove(Short.valueOf(s));
        f(s).a = false;
    }

    /* access modifiers changed from: package-private */
    public final synchronized uvi e(short s) {
        return g(s).b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int a(short s) {
        Integer num;
        num = (Integer) this.d.get(Short.valueOf(s));
        return num != null ? num.intValue() : -1;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(short s, int i) {
        this.d.put(Short.valueOf(s), Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean b(short s) {
        boolean z;
        boolean z2 = f(s).a;
        z = true;
        f(s).a = true;
        boolean z3 = g(s).a;
        g(s).a = true;
        if (!z2) {
            if (!z3) {
                z = false;
            }
        }
        if (!z) {
            jjg jjg = ulh.a;
        } else {
            jjg jjg2 = ulh.a;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(short s, uvi uvi) {
        g(s).b = uvi;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(short s, boolean z) {
        if (!z) {
            d(s);
        } else {
            c(s);
        }
    }
}

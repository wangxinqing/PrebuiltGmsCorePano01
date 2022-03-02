package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: gzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzr extends aucj implements audy {
    public static final gzr A;
    private static volatile auef D;
    private int B;
    private byte C = 2;
    public int a;
    public String b = "";
    public String c = "";
    public aucx d = auei.b;
    public aucx e = auei.b;
    public String f = "";
    public String g = "";
    public long h;
    public long i;
    public String j = "";
    public String k = "";
    public had l;
    public aucx m = auei.b;
    public String n = "";
    public long o;
    public aucx p = auei.b;
    public haa q;
    public int r;
    public int s;
    public gzv t;
    public String u = "";
    public String v = "";
    public int w;
    public gzt x;
    public boolean y;
    public boolean z;

    static {
        gzr gzr = new gzr();
        A = gzr;
        aucj.a(gzr.class, (aucj) gzr);
    }

    private gzr() {
    }

    public static /* synthetic */ void a(gzr gzr) {
        gzr.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        gzr.B = 3;
    }

    public final void b() {
        if (!this.e.a()) {
            this.e = aucj.a(this.e);
        }
    }

    public final void c() {
        if (!this.m.a()) {
            this.m = aucj.a(this.m);
        }
    }

    public final void d() {
        if (!this.p.a()) {
            this.p = aucj.a(this.p);
        }
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.C);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.C = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) A, "\u0001\u001a\u0000\u0001\u0001\u001e\u001a\u0000\u0004\u0002\u0001\b\u0000\u0002\u0002\u0004\u0003\b\u0006\u0004ԉ\b\u0006\b\u0007\u0007\u0002\u0005\t\u001a\n\b\u0001\u000b\u001a\f\b\u000b\r\u0005\f\u000e\u0004\r\u000f\u001a\u0010\b\u0002\u0011\b\u0003\u0012Љ\u000e\u0013\u001a\u0014\u0004\u000f\u0016\u0004\u0011\u0017\t\u0012\u0018\b\u0013\u0019\b\u0014\u001a\f\u0015\u001b\t\u0016\u001d\u0007\u0017\u001e\u0007\u0018", new Object[]{"a", "b", "h", "j", "l", "k", "i", "d", "c", "m", "n", "o", "B", "p", "f", "g", "q", "e", "r", "s", "t", "u", "v", "w", gzq.b(), "x", "y", "z"});
        } else if (i3 == 3) {
            return new gzr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) A);
            }
            if (i3 == 5) {
                return A;
            }
            auef auef = D;
            if (auef == null) {
                synchronized (gzr.class) {
                    auef = D;
                    if (auef == null) {
                        auef = new auce(A);
                        D = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}

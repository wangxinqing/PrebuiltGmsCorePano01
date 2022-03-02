package defpackage;

/* renamed from: amgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amgi extends aucj implements audy {
    public static final amgi D;
    private static volatile auef F;
    public aucx A = auei.b;
    public String B = "";
    public aucx C = auei.b;
    private byte E = 2;
    public int a;
    public String b = "";
    public amgn c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public aucx i = auei.b;
    public aucx j = auei.b;
    public aucx k = auei.b;
    public aucx l = auei.b;
    public aucx m = auei.b;
    public aucx n = auei.b;
    public aucx o = auei.b;
    public aucx p = auei.b;
    public aucx q = auei.b;
    public aucx r = auei.b;
    public aucx s = auei.b;
    public aucx t = auei.b;
    public aucx u = auei.b;
    public aucx v = auei.b;
    public aucx w = auei.b;
    public aucx x = auei.b;
    public aucx y = auei.b;
    public aucx z = auei.b;

    static {
        amgi amgi = new amgi();
        D = amgi;
        aucj.a(amgi.class, (aucj) amgi);
    }

    private amgi() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.E);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.E = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) D, "\u0001\u001c\u0000\u0001\u0001h\u001c\u0000\u0019\u0001\u0001\b\u0000\u0002\t\u0001\u0003\u001b\u0004\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\f\u001b\r\u001b\u000fЛ\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u001b\u001a\b\b\u001b\u001b#\u001b%\u001b'\u001b(\u001b)\u001b*\u001b+\u001b,\u001bh\u001b", new Object[]{"a", "b", "c", "d", amfz.class, "e", amgp.class, "i", amey.class, "j", amgw.class, "k", amfa.class, "f", amft.class, "g", amfm.class, "l", amgc.class, "h", amgo.class, "m", amgg.class, "o", amez.class, "p", amgs.class, "q", amfv.class, "r", amfn.class, "s", amgv.class, "B", "n", amgd.class, "t", amfs.class, "u", amgt.class, "v", amfw.class, "w", amgh.class, "x", amfb.class, "y", amfx.class, "z", amfo.class, "A", amfc.class, "C", amfd.class});
        } else if (i3 == 3) {
            return new amgi();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return D;
            }
            auef auef = F;
            if (auef == null) {
                synchronized (amgi.class) {
                    auef = F;
                    if (auef == null) {
                        auef = new auce(D);
                        F = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void b() {
        if (!this.g.a()) {
            this.g = aucj.a(this.g);
        }
    }

    public final void c() {
        if (!this.h.a()) {
            this.h = aucj.a(this.h);
        }
    }

    public final void d() {
        if (!this.o.a()) {
            this.o = aucj.a(this.o);
        }
    }

    public final void a() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}

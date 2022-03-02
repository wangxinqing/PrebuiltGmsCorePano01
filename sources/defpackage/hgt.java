package defpackage;

/* renamed from: hgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgt extends aucj implements audy {
    public static final hgt d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;

    static {
        hgt hgt = new hgt();
        d = hgt;
        aucj.a(hgt.class, (aucj) hgt);
    }

    private hgt() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001c\u0002\u001c\u0003\u001c", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new hgt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (hgt.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void b() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }

    public final void c() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }

    public final void a() {
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}

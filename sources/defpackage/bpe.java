package defpackage;

/* renamed from: bpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpe extends aucj implements audy {
    public static final bpe f;
    private static volatile auef g;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public int e;

    static {
        bpe bpe = new bpe();
        f = bpe;
        aucj.a(bpe.class, (aucj) bpe);
    }

    private bpe() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0004\u0001", new Object[]{"a", "b", "c", bpd.class, "d", bpf.class, "e"});
        } else if (i2 == 3) {
            return new bpe();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (bpe.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void b() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }

    public final void a() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}

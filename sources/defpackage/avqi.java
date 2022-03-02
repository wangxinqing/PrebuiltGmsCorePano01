package defpackage;

/* renamed from: avqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqi extends aucj implements audy {
    public static final avqi f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public String c = "";
    public aucx d = auei.b;
    public avqe e;

    static {
        avqi avqi = new avqi();
        f = avqi;
        aucj.a(avqi.class, (aucj) avqi);
    }

    private avqi() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\t\u0002", new Object[]{"a", "b", "c", "d", avqg.class, "e"});
        } else if (i2 == 3) {
            return new avqi();
        } else {
            if (i2 == 4) {
                return new avqh();
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avqi.class) {
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

    public final void c() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}

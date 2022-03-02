package defpackage;

/* renamed from: ansk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansk extends aucj implements audy {
    public static final ansk g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public aucx f = auei.b;

    static {
        ansk ansk = new ansk();
        g = ansk;
        aucj.a(ansk.class, (aucj) ansk);
    }

    private ansk() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u000b\u0002\u0004\u0002\u0003\u0005\u001a", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new ansk();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (ansk.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.f.a()) {
            this.f = aucj.a(this.f);
        }
    }
}

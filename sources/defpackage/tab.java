package defpackage;

/* renamed from: tab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tab extends aucj implements audy {
    public static final tab g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public long d;
    public double e;
    public aucx f = auei.b;

    static {
        tab tab = new tab();
        g = tab;
        aucj.a(tab.class, (aucj) tab);
    }

    private tab() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        Class<tab> cls = tab.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0005\u0000\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", cls});
        } else if (i2 == 3) {
            return new tab();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (cls) {
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

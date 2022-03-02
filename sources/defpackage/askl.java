package defpackage;

/* renamed from: askl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askl extends aucj implements audy {
    public static final askl g;
    private static volatile auef h;
    public int a;
    public long b;
    public int c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public int f;

    static {
        askl askl = new askl();
        g = askl;
        aucj.a(askl.class, (aucj) askl);
    }

    private askl() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u001b\u0004\u001b\u0005\f\u0002", new Object[]{"a", "b", "c", asoe.b(), "d", askm.class, "e", askm.class, "f", asoa.a});
        } else if (i2 == 3) {
            return new askl();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (askl.class) {
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

    public final void b() {
        if (!this.e.a()) {
            this.e = aucj.a(this.e);
        }
    }

    public final void a() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}

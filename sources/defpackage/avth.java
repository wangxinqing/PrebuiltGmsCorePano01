package defpackage;

/* renamed from: avth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avth extends aucj implements audy {
    public static final avth g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public aucx f;

    static {
        avth avth = new avth();
        g = avth;
        aucj.a(avth.class, (aucj) avth);
    }

    private avth() {
        auei auei = auei.b;
        this.f = auei.b;
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0002\u0003\u0006\u001b", new Object[]{"a", "b", "c", avtg.a, "d", "e", "f", avsv.class});
        } else if (i2 == 3) {
            return new avth();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avth.class) {
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
}

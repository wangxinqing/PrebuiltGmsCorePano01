package defpackage;

/* renamed from: avuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avuu extends aucj implements audy {
    public static final avuu g;
    private static volatile auef h;
    public aucx a = auei.b;
    public long b;
    public int c;
    public long d;
    public int e;
    public avut f;

    static {
        avuu avuu = new avuu();
        g = avuu;
        aucj.a(avuu.class, (aucj) avuu);
    }

    private avuu() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001\u001c\u0002\u0002\u0005\f\u0006\u0002\u0007\f\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new avuu();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avuu.class) {
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

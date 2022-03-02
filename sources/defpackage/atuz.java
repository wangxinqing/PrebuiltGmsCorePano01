package defpackage;

/* renamed from: atuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atuz extends aucj implements audy {
    public static final atuz f;
    private static volatile auef h;
    public float a;
    public float b;
    public float c;
    public int d;
    public aucx e = auei.b;
    private int g;

    static {
        atuz atuz = new atuz();
        f = atuz;
        aucj.a(atuz.class, (aucj) atuz);
    }

    private atuz() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0004\u0003\u0005\u001b", new Object[]{"g", "a", "b", "c", "d", "e", atuy.class});
        } else if (i2 == 3) {
            return new atuz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atuz.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}

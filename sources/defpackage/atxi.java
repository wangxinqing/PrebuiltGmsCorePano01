package defpackage;

/* renamed from: atxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atxi extends aucj implements audy {
    public static final atxi f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public atvp c;
    public atvp d;
    public boolean e;

    static {
        atxi atxi = new atxi();
        f = atxi;
        aucj.a(atxi.class, (aucj) atxi);
    }

    private atxi() {
        auay auay = auay.b;
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\u001b\u0004\t\u0002\u0005\t\u0003\u0006\u0007\u0004", new Object[]{"a", "b", atxh.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new atxi();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atxi.class) {
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
}

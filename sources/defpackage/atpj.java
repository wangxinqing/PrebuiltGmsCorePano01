package defpackage;

/* renamed from: atpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atpj extends aucj implements audy {
    public static final atpj g;
    private static volatile auef h;
    public int a;
    public int b;
    public long c;
    public int d;
    public atpf e;
    public atpg f;

    static {
        atpj atpj = new atpj();
        g = atpj;
        aucj.a(atpj.class, (aucj) atpj);
    }

    private atpj() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{"a", "b", atpi.a, "c", "d", atjs.b(), "e", "f"});
        } else if (i2 == 3) {
            return new atpj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atpj.class) {
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

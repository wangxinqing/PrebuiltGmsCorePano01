package defpackage;

/* renamed from: atbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atbj extends aucj implements audy {
    public static final atbj e;
    private static volatile auef f;
    public int a;
    public aucs b = aucl.b;
    public aucs c = aucl.b;
    public int d;

    static {
        atbj atbj = new atbj();
        e = atbj;
        aucj.a(atbj.class, (aucj) atbj);
    }

    private atbj() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001e\u0002\u001e\u0003\f\u0000", new Object[]{"a", "b", atbi.b(), "c", atbi.b(), "d", atbg.a});
        } else if (i2 == 3) {
            return new atbj();
        } else {
            if (i2 == 4) {
                return new atbf();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atbj.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}

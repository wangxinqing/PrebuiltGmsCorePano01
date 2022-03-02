package defpackage;

/* renamed from: ataf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ataf extends aucj implements audy {
    public static final ataf e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;

    static {
        ataf ataf = new ataf();
        e = ataf;
        aucj.a(ataf.class, (aucj) ataf);
    }

    private ataf() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", assn.class});
        } else if (i2 == 3) {
            return new ataf();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (ataf.class) {
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

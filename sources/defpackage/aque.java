package defpackage;

/* renamed from: aque  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aque extends aucj implements audy {
    public static final aque e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public aucx c = auei.b;
    public aqud d;

    static {
        aque aque = new aque();
        e = aque;
        aucj.a(aque.class, (aucj) aque);
    }

    private aque() {
        aucl aucl = aucl.b;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002\b\u0000\u0003\u001b\u0005\t\u0001", new Object[]{"a", "b", "c", aquc.class, "d"});
        } else if (i2 == 3) {
            return new aque();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aque.class) {
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

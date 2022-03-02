package defpackage;

/* renamed from: aqny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqny extends aucj implements audy {
    public static final aqny e;
    private static volatile auef f;
    public int a;
    public aqnd b;
    public aqnj c;
    public aqnn d;

    static {
        aqny aqny = new aqny();
        e = aqny;
        aucj.a(aqny.class, (aucj) aqny);
    }

    private aqny() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u001d\u0003\u0000\u0000\u0000\u0002\t\u0007\b\t\u0000\u001d\t\u000b", new Object[]{"a", "c", "b", "d"});
        } else if (i2 == 3) {
            return new aqny();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqny.class) {
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

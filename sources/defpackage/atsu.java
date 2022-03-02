package defpackage;

/* renamed from: atsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atsu extends aucj implements audy {
    public static final atsu e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;

    static {
        atsu atsu = new atsu();
        e = atsu;
        aucj.a(atsu.class, (aucj) atsu);
    }

    private atsu() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        Class<atsu> cls = atsu.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u001b", new Object[]{"a", "b", atjs.b(), "c", atsy.a, "d", cls});
        } else if (i2 == 3) {
            return new atsu();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (cls) {
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

package defpackage;

/* renamed from: atzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atzy extends aucj implements audy {
    public static final atzy e;
    private static volatile auef f;
    public int a;
    public atyi b;
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        atzy atzy = new atzy();
        e = atzy;
        aucj.a(atzy.class, (aucj) atzy);
    }

    private atzy() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", atzg.class, "d", atzh.class});
        } else if (i2 == 3) {
            return new atzy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atzy.class) {
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

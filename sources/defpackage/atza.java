package defpackage;

/* renamed from: atza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atza extends aucj implements audy {
    public static final atza e;
    private static volatile auef f;
    public int a;
    public atyi b;
    public atzn c;
    public aucx d = auei.b;

    static {
        atza atza = new atza();
        e = atza;
        aucj.a(atza.class, (aucj) atza);
    }

    private atza() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002\u001b\u0003\t\u0000\u0005\t\u0003", new Object[]{"a", "d", atzi.class, "b", "c"});
        } else if (i2 == 3) {
            return new atza();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atza.class) {
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

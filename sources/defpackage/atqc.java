package defpackage;

/* renamed from: atqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atqc extends aucj implements audy {
    public static final atqc e;
    private static volatile auef f;
    public int a;
    public atqk b;
    public aucx c = auei.b;
    public atjt d;

    static {
        atqc atqc = new atqc();
        e = atqc;
        aucj.a(atqc.class, (aucj) atqc);
    }

    private atqc() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001c\u0003\t\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new atqc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atqc.class) {
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

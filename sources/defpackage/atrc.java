package defpackage;

/* renamed from: atrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atrc extends aucj implements audy {
    public static final atrc d;
    private static volatile auef f;
    public atqk a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    private int e;

    static {
        atrc atrc = new atrc();
        d = atrc;
        aucj.a(atrc.class, (aucj) atrc);
    }

    private atrc() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\t\u0000\u0002\u001c\u0003\u001b", new Object[]{"e", "a", "b", "c", atpp.class});
        } else if (i2 == 3) {
            return new atrc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atrc.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}

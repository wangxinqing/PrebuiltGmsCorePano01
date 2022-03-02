package defpackage;

/* renamed from: atst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atst extends aucj implements audy {
    public static final atst e;
    public static final auci f;
    private static volatile auef h;
    public String a = "";
    public aucv b = audl.b;
    public atss c;
    public atsn d;
    private int g;

    static {
        atst atst = new atst();
        e = atst;
        aucj.a(atst.class, (aucj) atst);
        atjm atjm = atjm.a;
        atst atst2 = e;
        f = aucj.a((audx) atjm, (Object) atst2, (audx) atst2, 121873477, aufw.MESSAGE);
    }

    private atst() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\u0014\u0003\t\u0001\u0004\t\u0002", new Object[]{"g", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new atst();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atst.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(e);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}

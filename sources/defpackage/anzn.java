package defpackage;

/* renamed from: anzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anzn extends aucj implements audy {
    public static final anzn i;
    private static volatile auef j;
    public int a;
    public aucv b = audl.b;
    public aucv c = audl.b;
    public aucv d = audl.b;
    public aucv e = audl.b;
    public int f;
    public int g;
    public int h;

    static {
        anzn anzn = new anzn();
        i = anzn;
        aucj.a(anzn.class, (aucj) anzn);
    }

    private anzn() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0004\u0000\u0001\u0014\u0002\u0014\u0004\u0014\u0005\u0014\u0006\u0004\u0000\u0007\f\u0001\b\f\u0002", new Object[]{"a", "b", "c", "d", "e", "f", "g", anzm.a, "h", anzl.a});
        } else if (i3 == 3) {
            return new anzn();
        } else {
            if (i3 == 4) {
                return new anzk();
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (anzn.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}

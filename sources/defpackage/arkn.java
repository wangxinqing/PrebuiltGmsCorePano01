package defpackage;

/* renamed from: arkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arkn extends aucj implements audy {
    public static final arkn m;
    private static volatile auef o;
    public float a;
    public long b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public float g;
    public float h;
    public aucx i = auei.b;
    public aucx j = auei.b;
    public float k;
    public aucx l = auei.b;
    private int n;

    static {
        arkn arkn = new arkn();
        m = arkn;
        aucj.a(arkn.class, (aucj) arkn);
    }

    private arkn() {
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
            return aucj.a((audx) m, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0000\u0001\u0001\u0000\u0002\u0003\u0001\u0003\u001b\u0004\u001b\u0005\u0001\u0002\u0006\u0001\u0003\u0007\u001b\b\u001b\t\u0001\u0004\n\u001b\u000b\u001b\f\u001b", new Object[]{"n", "a", "b", "c", arlc.class, "f", arkz.class, "g", "h", "i", arkk.class, "j", arkk.class, "k", "l", arkl.class, "d", arlc.class, "e", arlc.class});
        } else if (i3 == 3) {
            return new arkn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (arkn.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(m);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}

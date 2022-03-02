package defpackage;

/* renamed from: aqql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqql extends aucj implements audy {
    public static final aqql l;
    private static volatile auef q;
    public int a;
    public aqsr b;
    public aqsr c;
    public aqsr d;
    public aqsr e;
    public aqsr f;
    public aqst g;
    public aqro h;
    public aqsr i;
    public aqsr j;
    public aqsr k;
    private aqsr m;
    private aqsr n;
    private aqsr o;
    private aqsr p;

    static {
        aqql aqql = new aqql();
        l = aqql;
        aucj.a(aqql.class, (aucj) aqql);
    }

    private aqql() {
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
            return aucj.a((audx) l, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0004\t\u0002\u0006\t\u0005\u0007\t\u0003\b\t\u0006\t\t\t\n\t\n\u000b\t\u000b\f\t\u0007\r\t\b\u000e\t\f\u000f\t\r\u0010\t\u000e", new Object[]{"a", "b", "c", "d", "f", "e", "g", "n", "o", "i", "m", "h", "j", "k", "p"});
        } else if (i3 == 3) {
            return new aqql();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (aqql.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(l);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}

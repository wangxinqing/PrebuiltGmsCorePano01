package defpackage;

/* renamed from: aatj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aatj extends aucj implements audy {
    public static final aatj e;
    private static volatile auef g;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    private boolean f;

    static {
        aatj aatj = new aatj();
        e = aatj;
        aucj.a(aatj.class, (aucj) aatj);
    }

    private aatj() {
    }

    public static /* synthetic */ void a(aatj aatj) {
        aatj.a |= 8;
        aatj.f = true;
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d", "f"});
        } else if (i2 == 3) {
            return new aatj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aatj.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}

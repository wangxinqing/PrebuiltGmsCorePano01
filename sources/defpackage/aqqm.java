package defpackage;

/* renamed from: aqqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqqm extends aucj implements audy {
    public static final aqqm h;
    private static volatile auef i;
    public int a;
    public aucx b = auei.b;
    public int c;
    public int d;
    public int e;
    public aqsr f;
    public String g = "";

    static {
        aqqm aqqm = new aqqm();
        h = aqqm;
        aucj.a(aqqm.class, (aucj) aqqm);
    }

    private aqqm() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0004\u0002\u0005\t\u0003\u0006\b\u0004", new Object[]{"a", "b", aqqn.class, "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aqqm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqqm.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}

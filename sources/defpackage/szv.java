package defpackage;

/* renamed from: szv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szv extends aucj implements audy {
    public static final szv h;
    private static volatile auef i;
    public int a;
    public long b;
    public String c = "";
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public boolean g;

    static {
        szv szv = new szv();
        h = szv;
        aucj.a(szv.class, (aucj) szv);
    }

    private szv() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0004\u001b\u0005\u001b\u0006\u001b\b\u0007\u0004", new Object[]{"a", "b", "c", "d", szw.class, "e", szu.class, "f", szk.class, "g"});
        } else if (i3 == 3) {
            return new szv();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (float[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (szv.class) {
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

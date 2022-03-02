package defpackage;

/* renamed from: avid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avid extends aucj implements audy {
    public static final avid h;
    private static volatile auef i;
    public int a;
    public int b;
    public double c;
    public double d;
    public long e;
    public String f = "";
    public String g = "";

    static {
        avid avid = new avid();
        h = avid;
        aucj.a(avid.class, (aucj) avid);
    }

    private avid() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0002\u0003\u0006\b\u0005\u0007\b\u0006", new Object[]{"a", "b", avib.a, "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new avid();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (avid.class) {
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

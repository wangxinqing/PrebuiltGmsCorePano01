package defpackage;

/* renamed from: avon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avon extends aucj implements audy {
    public static final avon e;
    private static volatile auef g;
    public String a = "";
    public String b = "";
    public avom c;
    public String d = "";
    private int f;

    static {
        avon avon = new avon();
        e = avon;
        aucj.a(avon.class, (aucj) avon);
    }

    private avon() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001\b\u0000\u0004\b\u0001\u0006\t\u0003\n\b\u0006", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new avon();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avon.class) {
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

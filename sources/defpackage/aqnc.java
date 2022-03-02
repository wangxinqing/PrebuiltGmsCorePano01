package defpackage;

/* renamed from: aqnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqnc extends aucj implements audy {
    public static final aqnc k;
    private static volatile auef l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = -1;
    public int i = -1;
    public int j;

    static {
        aqnc aqnc = new aqnc();
        k = aqnc;
        aucj.a(aqnc.class, (aucj) aqnc);
    }

    private aqnc() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\f\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", aqnb.a});
        } else if (i3 == 3) {
            return new aqnc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aqnc.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}

package defpackage;

/* renamed from: otw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class otw extends aucj implements audy {
    public static final otw i;
    private static volatile auef j;
    public int a;
    public long b;
    public String c = "";
    public int d;
    public int e;
    public int f = -1;
    public boolean g;
    public int h;

    static {
        otw otw = new otw();
        i = otw;
        aucj.a(otw.class, (aucj) otw);
    }

    private otw() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\u0003\u0000\u0002\b\u0001\u0004\u000b\u0003\u0005\f\u0004\u0007\u0004\u0006\b\u0007\u0007\t\f\b", new Object[]{"a", "b", "c", "d", "e", ovg.b(), "f", "g", "h", otk.b()});
        } else if (i3 == 3) {
            return new otw();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (otw.class) {
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

package defpackage;

/* renamed from: aqtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqtw extends aucj implements audy {
    public static final aqtw h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public aqsr c;
    public String d = "";
    public aqpm e;
    public boolean f = true;
    public String g = "";

    static {
        aqtw aqtw = new aqtw();
        h = aqtw;
        aucj.a(aqtw.class, (aucj) aqtw);
    }

    private aqtw() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002\b\u0001\u0003\t\u0002\u0004\b\u0003\u0005\t\u0004\u0006\u0007\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aqtw();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqtw.class) {
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

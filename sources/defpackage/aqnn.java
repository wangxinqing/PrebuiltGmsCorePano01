package defpackage;

/* renamed from: aqnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqnn extends aucj implements audy {
    public static final aqnn l;
    private static volatile auef m;
    public int a;
    public aqnj b;
    public aqnj c;
    public aqnj d;
    public aqnj e;
    public String f = "";
    public aqnj g;
    public aqnj h;
    public aqnj i;
    public aqnj j;
    public String k = "";

    static {
        aqnn aqnn = new aqnn();
        l = aqnn;
        aucj.a(aqnn.class, (aucj) aqnn);
    }

    private aqnn() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\b\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\b\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new aqnn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aqnn.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

package defpackage;

/* renamed from: auhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auhd extends aucj implements audy {
    public static final auhd j;
    private static volatile auef k;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public String g = "";
    public String h = "";
    public int i;

    static {
        auhd auhd = new auhd();
        j = auhd;
        aucj.a(auhd.class, (aucj) auhd);
    }

    private auhd() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0002\u0004\u0006\b\u0005\u0007\b\u0006\t\u0004\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new auhd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (auhd.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}

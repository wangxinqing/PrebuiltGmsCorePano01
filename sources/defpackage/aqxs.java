package defpackage;

/* renamed from: aqxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxs extends aucj implements audy {
    public static final aqxs h;
    private static volatile auef i;
    public String a = "";
    public String b = "";
    public long c;
    public long d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        aqxs aqxs = new aqxs();
        h = aqxs;
        aucj.a(aqxs.class, (aucj) aqxs);
    }

    private aqxs() {
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
            return aucj.a((audx) h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u0003\u0005\u0004\u0006\u0007\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aqxs();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqxs.class) {
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

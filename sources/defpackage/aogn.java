package defpackage;

/* renamed from: aogn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aogn extends aucj implements audy {
    public static final aogn k;
    private static volatile auef l;
    public int a;
    public String b = "";
    public String c = "";
    public long d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    static {
        aogn aogn = new aogn();
        k = aogn;
        aucj.a(aogn.class, (aucj) aogn);
    }

    private aogn() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\f\u0003\u0005\u0002\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0004\u0007\t\f\b", new Object[]{"a", "b", "c", "d", "e", aogm.a, "f", "g", "h", "i", "j", aogk.a});
        } else if (i3 == 3) {
            return new aogn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aogn.class) {
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

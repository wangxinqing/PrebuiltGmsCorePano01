package defpackage;

/* renamed from: aqpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpp extends aucj implements audy {
    public static final aqpp j;
    private static volatile auef k;
    public int a;
    public aqrv b;
    public aqqf c;
    public aqru d;
    public aqtu e;
    public aqql f;
    public aqsw g;
    public aqpt h;
    public aqsd i;

    static {
        aqpp aqpp = new aqpp();
        j = aqpp;
        aucj.a(aqpp.class, (aucj) aqpp);
    }

    private aqpp() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0002Ϩ\b\u0000\u0000\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\b\t\u0006\t\t\u0007Ϩ\t\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new aqpp();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (aqpp.class) {
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

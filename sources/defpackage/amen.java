package defpackage;

/* renamed from: amen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amen extends aucj implements audy {
    public static final amen k;
    private static volatile auef l;
    public int a;
    public amer b;
    public amej c;
    public boolean d;
    public amev e;
    public amew f;
    public amet g;
    public long h;
    public ameh i;
    public long j;

    static {
        amen amen = new amen();
        k = amen;
        aucj.a(amen.class, (aucj) amen);
    }

    private amen() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u0003\u0006\b\t\u0007\t\u0003\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new amen();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (amen.class) {
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

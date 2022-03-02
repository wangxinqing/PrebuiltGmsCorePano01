package defpackage;

/* renamed from: asvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asvn extends aucj implements audy {
    public static final asvn k;
    private static volatile auef l;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;

    static {
        asvn asvn = new asvn();
        k = asvn;
        aucj.a(asvn.class, (aucj) asvn);
    }

    private asvn() {
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
            return aucj.a((audx) k, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0005\f\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b<\u0000", new Object[]{"c", "b", "a", "d", atev.b(), "e", atex.b(), "f", "g", "h", atex.b(), "i", "j", asvo.class});
        } else if (i3 == 3) {
            return new asvn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (asvn.class) {
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

package defpackage;

/* renamed from: aojn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aojn extends aucj implements audy {
    public static final aojn i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public aucs h = aucl.b;

    static {
        aojn aojn = new aojn();
        i = aojn;
        aucj.a(aojn.class, (aucj) aojn);
    }

    private aojn() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u001e", new Object[]{"a", "b", "c", aolv.b(), "d", aolx.b(), "e", "f", "g", "h", aonm.b()});
        } else if (i3 == 3) {
            return new aojn();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (short[][]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aojn.class) {
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

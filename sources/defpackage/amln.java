package defpackage;

/* renamed from: amln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amln extends aucj implements audy {
    public static final amln i;
    private static volatile auef j;
    public int a;
    public long b;
    public long c;
    public aucx d = auei.b;
    public long e;
    public long f;
    public amkc g;
    public int h;

    static {
        amln amln = new amln();
        i = amln;
        aucj.a(amln.class, (aucj) amln);
    }

    private amln() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001\u0005\u0000\u0002\u0005\u0001\u0003\u001b\u0004\u0002\u0002\u0005\u0002\u0003\n\t\u0004\u000b\f\u0005", new Object[]{"a", "b", "c", "d", amkp.class, "e", "f", "g", "h", amlm.a});
        } else if (i3 == 3) {
            return new amln();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (short[]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (amln.class) {
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

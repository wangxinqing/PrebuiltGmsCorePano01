package defpackage;

/* renamed from: atau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atau extends aucj implements audy {
    public static final atau d;
    private static volatile auef e;
    public int a;
    public aujb b;
    public aucx c = auei.b;

    static {
        atau atau = new atau();
        d = atau;
        aucj.a(atau.class, (aucj) atau);
    }

    private atau() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b", new Object[]{"a", "b", "c", atat.class});
        } else if (i2 == 3) {
            return new atau();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atau.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}

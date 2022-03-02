package defpackage;

/* renamed from: anup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anup extends aucj implements audy {
    public static final anup h;
    private static volatile auef i;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public String d = "";
    public int e;
    public long f;
    public long g;

    static {
        anup anup = new anup();
        h = anup;
        aucj.a(anup.class, (aucj) anup);
    }

    private anup() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u001b\u0003\u001b\u0004\b\u0000\u0005\f\u0001\u0006\u0002\u0002\u0007\u0002\u0003", new Object[]{"a", "b", anus.class, "c", anuo.class, "d", "e", anur.a, "f", "g"});
        } else if (i3 == 3) {
            return new anup();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][][]) null, (short[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (anup.class) {
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

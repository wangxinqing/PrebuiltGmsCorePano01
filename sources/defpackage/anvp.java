package defpackage;

/* renamed from: anvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anvp extends aucj implements audy {
    public static final anvp h;
    private static volatile auef i;
    public int a;
    public int b;
    public anvj c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        anvp anvp = new anvp();
        h = anvp;
        aucj.a(anvp.class, (aucj) anvp);
    }

    private anvp() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005", new Object[]{"a", "b", anvk.a, "c", "d", anvl.a, "e", anvn.b(), "f", anvo.a, "g", anxo.a});
        } else if (i3 == 3) {
            return new anvp();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (anvp.class) {
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

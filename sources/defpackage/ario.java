package defpackage;

/* renamed from: ario  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ario extends aucj implements audy {
    public static final ario h;
    private static volatile auef i;
    public int a;
    public long b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public int e;
    public arip f;
    public ariz g;

    static {
        ario ario = new ario();
        h = ario;
        aucj.a(ario.class, (aucj) ario);
    }

    private ario() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u001b\u0003\u001b\u0004\f\u0001\u0005\t\u0002\u0006\t\u0003", new Object[]{"a", "b", "c", aris.class, "d", ariq.class, "e", arin.b(), "f", "g"});
        } else if (i3 == 3) {
            return new ario();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (ario.class) {
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

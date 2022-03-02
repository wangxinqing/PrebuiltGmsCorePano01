package defpackage;

/* renamed from: aumd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aumd extends aucj implements audy {
    public static final aumd h;
    private static volatile auef i;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public String e = "";
    public auay f = auay.b;
    public aucx g = auei.b;

    static {
        aumd aumd = new aumd();
        h = aumd;
        aucj.a(aumd.class, (aucj) aumd);
    }

    private aumd() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001=\u0000\u0002;\u0000\u0003\b\u0002\u0004\b\u0003\u0005\n\u0004\u0006\u001b", new Object[]{"c", "b", "a", "d", "e", "f", "g", aumc.class});
        } else if (i3 == 3) {
            return new aumd();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aumd.class) {
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

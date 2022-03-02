package defpackage;

/* renamed from: araw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class araw extends aucj implements audy {
    public static final araw m;
    private static volatile auef n;
    public auay a = auay.b;
    public aucx b = auei.b;
    public audr c = audr.b;
    public audr d = audr.b;
    public int e;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public audr h = audr.b;
    public aucx i = auei.b;
    public aucs j = aucl.b;
    public aucs k = aucl.b;
    public aucs l = aucl.b;

    static {
        araw araw = new araw();
        m = araw;
        aucj.a(araw.class, (aucj) araw);
    }

    private araw() {
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
            return aucj.a((audx) m, "\u0000\f\u0000\u0000\u0001\u000e\f\u0003\u0007\u0000\u0001\n\u0003\u001b\u00052\u00062\u0007\f\b\u001b\t\u001c\n2\u000bȚ\f'\r'\u000e'", new Object[]{"a", "b", aran.class, "c", arat.a, "d", aras.a, "e", "f", aran.class, "g", "h", arau.a, "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new araw();
        } else {
            if (i3 == 4) {
                return new aucd((int[][]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (araw.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}

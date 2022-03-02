package defpackage;

/* renamed from: avkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avkw extends aucj implements audy {
    public static final avkw g;
    private static volatile auef h;
    public int a;
    public avkx b;
    public avky c;
    public avlg d;
    public aucx e = auei.b;
    public avlf f;

    static {
        avkw avkw = new avkw();
        g = avkw;
        aucj.a(avkw.class, (aucj) avkw);
    }

    private avkw() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u001b\u0005\t\u0003", new Object[]{"a", "b", "c", "d", "e", avkv.class, "f"});
        } else if (i2 == 3) {
            return new avkw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avkw.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}

package defpackage;

/* renamed from: avol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avol extends aucj implements audy {
    public static final avol e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public int c;
    public String d = "";

    static {
        avol avol = new avol();
        e = avol;
        aucj.a(avol.class, (aucj) avol);
    }

    private avol() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0000\u0003\b\u0001", new Object[]{"a", "b", avok.class, "c", avmg.a, "d"});
        } else if (i2 == 3) {
            return new avol();
        } else {
            if (i2 == 4) {
                return new aucd((byte[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avol.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}

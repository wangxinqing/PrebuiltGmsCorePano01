package defpackage;

/* renamed from: aasa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aasa extends aucj implements audy {
    public static final aasa f;
    private static volatile auef h;
    public String a = "";
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aucx e = auei.b;
    private int g;

    static {
        aasa aasa = new aasa();
        f = aasa;
        aucj.a(aasa.class, (aucj) aasa);
    }

    private aasa() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\b\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001b", new Object[]{"g", "a", "b", "c", "d", "e", aarz.class});
        } else if (i2 == 3) {
            return new aasa();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aasa.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}

package defpackage;

/* renamed from: aqui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqui extends aucj implements audy {
    public static final aqui f;
    private static volatile auef g;
    public int a;
    public avoq b;
    public String c = "";
    public int d;
    public String e;

    static {
        aqui aqui = new aqui();
        f = aqui;
        aucj.a(aqui.class, (aucj) aqui);
    }

    private aqui() {
        aucl aucl = aucl.b;
        this.e = "";
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\t\u0000\u0003\b\u0002\u0006\u000b\u0003\u0007\b\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqui();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqui.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}

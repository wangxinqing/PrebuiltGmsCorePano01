package defpackage;

/* renamed from: apke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apke extends aucj implements audy {
    public static final auct c = new apkb();
    public static final apke d;
    private static volatile auef f;
    public String a = "";
    public aucs b = aucl.b;
    private int e;

    static {
        apke apke = new apke();
        d = apke;
        aucj.a(apke.class, (aucj) apke);
    }

    private apke() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001e", new Object[]{"e", "a", "b", apkd.b()});
        } else if (i2 == 3) {
            return new apke();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (apke.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}

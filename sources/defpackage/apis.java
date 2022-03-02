package defpackage;

/* renamed from: apis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apis extends aucj implements audy {
    public static final auct g = new apir();
    public static final apis k;
    private static volatile auef m;
    public int a;
    public String b = "";
    public int c;
    public apit d;
    public String e = "";
    public aucs f = aucl.b;
    public apkh h;
    public apks i;
    public apkg j;
    private byte l = 2;

    static {
        apis apis = new apis();
        k = apis;
        aucj.a(apis.class, (aucj) apis);
    }

    private apis() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) k, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001\b\u0000\u0003\f\u0002\u0004\t\u0003\u0006\b\u0005\u0007\u001e\b\t\u0006\n\t\b\u000b\t\t", new Object[]{"a", "b", "c", apix.b(), "d", "e", "f", apix.b(), "h", "i", "j"});
        } else if (i3 == 3) {
            return new apis();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (apis.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

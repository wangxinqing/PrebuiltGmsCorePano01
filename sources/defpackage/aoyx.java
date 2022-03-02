package defpackage;

@Deprecated
/* renamed from: aoyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoyx extends aucj implements audy {
    public static final aoyx e;
    private static volatile auef f;
    public String a = "";
    public String b = "";
    public boolean c;
    public String d = "";

    static {
        aoyx aoyx = new aoyx();
        e = aoyx;
        aucj.a(aoyx.class, (aucj) aoyx);
    }

    private aoyx() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\u0007\u0005Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aoyx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aoyx.class) {
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

package defpackage;

/* renamed from: aofj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aofj extends aucj implements audy {
    public static final aofj d;
    private static volatile auef g;
    public int a;
    public String b = "";
    public int c;
    private anzf e;
    private byte f = 2;

    static {
        aofj aofj = new aofj();
        d = aofj;
        aucj.a(aofj.class, (aucj) aofj);
    }

    private aofj() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0004\b\u0003\u0005\f\u0004", new Object[]{"a", "e", "b", "c", aofi.a});
        } else if (i2 == 3) {
            return new aofj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aofj.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(d);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}

package defpackage;

/* renamed from: aody  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aody extends aucj implements audy {
    public static final aody d;
    private static volatile auef g;
    public int a;
    public String b = "";
    public aodr c;
    private anzf e;
    private byte f = 2;

    static {
        aody aody = new aody();
        d = aody;
        aucj.a(aody.class, (aucj) aody);
    }

    private aody() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001\u0003\t\u0002", new Object[]{"a", "b", "e", "c"});
        } else if (i2 == 3) {
            return new aody();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aody.class) {
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

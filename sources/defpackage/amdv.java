package defpackage;

/* renamed from: amdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdv extends aucg implements audy {
    public static final amdv a;
    private static volatile auef c;
    private byte b = 2;

    static {
        amdv amdv = new amdv();
        a = amdv;
        aucj.a(amdv.class, (aucj) amdv);
    }

    private amdv() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        byte b2 = 1;
        if (i2 == 1) {
            if (obj == null) {
                b2 = 0;
            }
            this.b = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new amdv();
            }
            if (i2 == 4) {
                return new aucf(a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (amdv.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(a);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}

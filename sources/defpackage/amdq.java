package defpackage;

/* renamed from: amdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdq extends aucj implements audy {
    public static final amdq b;
    private static volatile auef d;
    public aucx a = auei.b;
    private byte c = 2;

    static {
        amdq amdq = new amdq();
        b = amdq;
        aucj.a(amdq.class, (aucj) amdq);
    }

    private amdq() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.c = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", amdu.class});
        } else if (i2 == 3) {
            return new amdq();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (amdq.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}

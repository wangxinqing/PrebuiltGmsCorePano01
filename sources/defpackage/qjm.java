package defpackage;

/* renamed from: qjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjm extends aucj implements audy {
    public static final qjm c;
    private static volatile auef d;
    public audr a = audr.b;
    public long b;

    static {
        qjm qjm = new qjm();
        c = qjm;
        aucj.a(qjm.class, (aucj) qjm);
    }

    private qjm() {
    }

    public final audr a() {
        audr audr = this.a;
        if (!audr.a) {
            this.a = audr.a();
        }
        return this.a;
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\u0002", new Object[]{"a", qjl.a, "b"});
        } else if (i2 == 3) {
            return new qjm();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (qjm.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}

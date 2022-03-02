package defpackage;

/* renamed from: avik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avik extends aucj implements audy {
    public static final avik d;
    public static final auci e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public avjg c;

    static {
        avik avik = new avik();
        d = avik;
        aucj.a(avik.class, (aucj) avik);
        amdv amdv = amdv.a;
        avik avik2 = d;
        e = aucj.a((audx) amdv, (Object) avik2, (audx) avik2, 64399324, aufw.MESSAGE);
    }

    private avik() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004\t\u0002", new Object[]{"a", "b", avhs.class, "c"});
        } else if (i2 == 3) {
            return new avik();
        } else {
            if (i2 == 4) {
                return new avij();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avik.class) {
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

    public final void c() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}

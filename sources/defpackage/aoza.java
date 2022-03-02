package defpackage;

/* renamed from: aoza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoza extends aucj implements audy {
    public static final aoza c;
    private static volatile auef d;
    public int a;
    public aucx b = auei.b;

    static {
        aoza aoza = new aoza();
        c = aoza;
        aucj.a(aoza.class, (aucj) aoza);
    }

    private aoza() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", aoyz.class});
        } else if (i2 == 3) {
            return new aoza();
        } else {
            if (i2 == 4) {
                return new aoyy();
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aoza.class) {
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

    public final void a() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}

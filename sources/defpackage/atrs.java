package defpackage;

/* renamed from: atrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atrs extends aucj implements audy {
    public static final atrs b;
    public static final auci c;
    private static volatile auef d;
    public aucx a = auei.b;

    static {
        atrs atrs = new atrs();
        b = atrs;
        aucj.a(atrs.class, (aucj) atrs);
        atjm atjm = atjm.a;
        atrs atrs2 = b;
        c = aucj.a((audx) atjm, (Object) atrs2, (audx) atrs2, 77815057, aufw.MESSAGE);
    }

    private atrs() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", atrq.class});
        } else if (i2 == 3) {
            return new atrs();
        } else {
            if (i2 == 4) {
                return new atrr();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (atrs.class) {
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

    public final void a() {
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}

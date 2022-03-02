package defpackage;

/* renamed from: atvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atvc extends aucj implements audy {
    public static final atvc b;
    public static final auci c;
    private static volatile auef d;
    public aucx a = auei.b;

    static {
        atvc atvc = new atvc();
        b = atvc;
        aucj.a(atvc.class, (aucj) atvc);
        atjm atjm = atjm.a;
        atvc atvc2 = b;
        c = aucj.a((audx) atjm, (Object) atvc2, (audx) atvc2, 85660099, aufw.MESSAGE);
    }

    private atvc() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", atvd.class});
        } else if (i2 == 3) {
            return new atvc();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (atvc.class) {
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

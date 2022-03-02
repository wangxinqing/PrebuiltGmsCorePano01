package defpackage;

/* renamed from: attu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class attu extends aucj implements audy {
    public static final attu b;
    public static final auci c;
    private static volatile auef d;
    public aucx a = auei.b;

    static {
        attu attu = new attu();
        b = attu;
        aucj.a(attu.class, (aucj) attu);
        atjm atjm = atjm.a;
        attu attu2 = b;
        c = aucj.a((audx) atjm, (Object) attu2, (audx) attu2, 87665812, aufw.MESSAGE);
    }

    private attu() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", atts.class});
        } else if (i2 == 3) {
            return new attu();
        } else {
            if (i2 == 4) {
                return new attt();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (attu.class) {
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

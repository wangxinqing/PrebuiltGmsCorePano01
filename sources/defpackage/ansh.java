package defpackage;

/* renamed from: ansh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansh extends aucj implements audy {
    public static final ansh e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public int d;

    static {
        ansh ansh = new ansh();
        e = ansh;
        aucj.a(ansh.class, (aucj) ansh);
    }

    private ansh() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0003\u001b\u0004\u0004\u0000", new Object[]{"a", "b", ansk.class, "c", ansi.class, "d"});
        } else if (i2 == 3) {
            return new ansh();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (ansh.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
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

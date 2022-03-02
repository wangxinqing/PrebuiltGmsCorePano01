package defpackage;

/* renamed from: ovp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovp extends aucj implements audy {
    public static final ovp c;
    private static volatile auef d;
    public aucx a = auei.b;
    public aucx b = auei.b;

    static {
        ovp ovp = new ovp();
        c = ovp;
        aucj.a(ovp.class, (aucj) ovp);
    }

    private ovp() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[]{"a", ovo.class, "b"});
        } else if (i2 == 3) {
            return new ovp();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (ovp.class) {
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
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}

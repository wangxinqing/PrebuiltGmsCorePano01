package defpackage;

/* renamed from: apez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apez extends aucj implements audy {
    public static final apez e;
    private static volatile auef f;
    public int a;
    public auay b = auay.b;
    public aucx c = auei.b;
    public boolean d;

    static {
        apez apez = new apez();
        e = apez;
        aucj.a(apez.class, (aucj) apez);
    }

    private apez() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0000\u0002\u001c\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new apez();
        } else {
            if (i2 == 4) {
                return new apey();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (apez.class) {
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
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}

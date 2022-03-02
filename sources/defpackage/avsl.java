package defpackage;

/* renamed from: avsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avsl extends aucj implements audy {
    public static final avsl b;
    private static volatile auef c;
    public audr a = audr.b;

    static {
        avsl avsl = new avsl();
        b = avsl;
        aucj.a(avsl.class, (aucj) avsl);
    }

    private avsl() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", avsk.a});
        } else if (i2 == 3) {
            return new avsl();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (avsl.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final audr c() {
        audr audr = this.a;
        if (!audr.a) {
            this.a = audr.a();
        }
        return this.a;
    }
}

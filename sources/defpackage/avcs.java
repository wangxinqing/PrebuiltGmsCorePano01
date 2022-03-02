package defpackage;

/* renamed from: avcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avcs extends aucj implements audy {
    public static final avcs c;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucx b = auei.b;
    private byte d = 2;

    static {
        avcs avcs = new avcs();
        c = avcs;
        aucj.a(avcs.class, (aucj) avcs);
    }

    private avcs() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u001a", new Object[]{"a", avaf.class, "b"});
        } else if (i2 == 3) {
            return new avcs();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avcs.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void c() {
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}

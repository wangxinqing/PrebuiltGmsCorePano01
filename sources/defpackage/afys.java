package defpackage;

/* renamed from: afys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afys extends aucj implements audy {
    public static final afys f;
    private static volatile auef h;
    public int a;
    public aucx b = auei.b;
    public long c;
    public long d;
    public aucx e = auei.b;
    private byte g = 2;

    static {
        afys afys = new afys();
        f = afys;
        aucj.a(afys.class, (aucj) afys);
    }

    private afys() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001Л\u0002\u0002\u0000\u0003\u0002\u0001\u0004\u001b", new Object[]{"a", "b", afyq.class, "c", "d", "e", afyr.class});
        } else if (i2 == 3) {
            return new afys();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (afys.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void b() {
        if (!this.e.a()) {
            this.e = aucj.a(this.e);
        }
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}

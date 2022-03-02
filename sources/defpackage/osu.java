package defpackage;

/* renamed from: osu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class osu extends aucj implements audy {
    public static final osu b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        osu osu = new osu();
        b = osu;
        aucj.a(osu.class, (aucj) osu);
    }

    private osu() {
    }

    public static osu a(byte[] bArr) {
        aucj a2 = aucj.a((aucj) b, bArr, 0, bArr.length, aubs.b());
        aucj.b(a2);
        return (osu) a2;
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ost.class});
        } else if (i2 == 3) {
            return new osu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (osu.class) {
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
}

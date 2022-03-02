package defpackage;

/* renamed from: ailg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ailg extends aucj implements audy {
    public static final ailg d;
    private static volatile auef e;
    public aucx a = auei.b;
    public ailw b;
    public aucs c = aucl.b;

    static {
        ailg ailg = new ailg();
        d = ailg;
        aucj.a(ailg.class, (aucj) ailg);
    }

    private ailg() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\t\u0003'", new Object[]{"a", ailk.class, "b", "c"});
        } else if (i2 == 3) {
            return new ailg();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (ailg.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}

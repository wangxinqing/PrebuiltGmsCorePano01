package defpackage;

/* renamed from: anxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anxk extends aucj implements audy {
    public static final anxk j;
    private static volatile auef k;
    public int a;
    public anvq b;
    public anvp c;
    public anwg d;
    public anwb e;
    public anvu f;
    public anxj g;
    public aucx h = auei.b;
    public anxn i;

    static {
        anxk anxk = new anxk();
        j = anxk;
        aucj.a(anxk.class, (aucj) anxk);
    }

    private anxk() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u001b\b\t\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", anvg.class, "i"});
        } else if (i3 == 3) {
            return new anxk();
        } else {
            if (i3 == 4) {
                return new aucd((short[][][]) null, (boolean[][][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anxk.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}

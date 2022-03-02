package defpackage;

/* renamed from: askx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askx extends aucj implements audy {
    public static final askx m;
    private static volatile auef n;
    public int a;
    public int b;
    public int c;
    public int d;
    public askv e;
    public askr f;
    public askt g;
    public asks h;
    public long i;
    public long j;
    public askw k;
    public asku l;

    static {
        askx askx = new askx();
        m = askx;
        aucj.a(askx.class, (aucj) askx);
    }

    private askx() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\f\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\u0002\u0007\t\u0002\b\n\t\t\u000b\t\n", new Object[]{"a", "b", "c", asor.a, "d", asow.a, "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new askx();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (askx.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}

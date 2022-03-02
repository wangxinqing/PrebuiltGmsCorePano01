package defpackage;

/* renamed from: anzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anzy extends aucj implements audy {
    public static final anzy p;
    private static volatile auef q;
    public int a;
    public long b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long j;
    public long k;
    public int l;
    public int m;
    public long n;
    public anzn o;

    static {
        anzy anzy = new anzy();
        p = anzy;
        aucj.a(anzy.class, (aucj) anzy);
    }

    private anzy() {
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
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001\u0005\u0000\u0003\u001b\u0004\u001b\u0005\u0002\u0001\u0006\u0002\u0002\u0007\u0002\u0003\b\u0004\u0004\t\u0004\u0005\n\u0002\u0006\u000b\u0002\u0007\f\u0004\b\r\u0004\t\u000e\u0002\n\u000f\t\u000b", new Object[]{"a", "b", "c", aoac.class, "d", aoad.class, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i3 == 3) {
            return new anzy();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null, (char[]) null);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (anzy.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(p);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}

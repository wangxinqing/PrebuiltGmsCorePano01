package defpackage;

/* renamed from: aoaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoaj extends aucj implements audy {
    public static final aoaj j;
    private static volatile auef k;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public aucx h = auei.b;
    public int i;

    static {
        aoaj aoaj = new aoaj();
        j = aoaj;
        aucj.a(aoaj.class, (aucj) aoaj);
    }

    private aoaj() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u001b\b\u0004\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", aoai.class, "i"});
        } else if (i3 == 3) {
            return new aoaj();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (short[]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (aoaj.class) {
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

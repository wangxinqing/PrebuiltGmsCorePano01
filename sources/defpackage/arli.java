package defpackage;

/* renamed from: arli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arli extends aucj implements audy {
    public static final arli l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public arlu k;

    static {
        arli arli = new arli();
        l = arli;
        aucj.a(arli.class, (aucj) arli);
    }

    private arli() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u000f\u0000\u0002\u000f\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\u000b\u0004\u0006\u000b\u0005\u0007\u000b\u0006\b\u000b\u0007\t\u0004\b\n\t\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new arli();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (arli.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

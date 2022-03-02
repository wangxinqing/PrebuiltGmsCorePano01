package defpackage;

/* renamed from: aung  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aung extends aucj implements audy {
    public static final aung h;
    private static volatile auef i;
    public int a;
    public aukh b;
    public aucx c = auei.b;
    public aumr d;
    public aucx e = auei.b;
    public aune f;
    public aunf g;

    static {
        aung aung = new aung();
        h = aung;
        aucj.a(aung.class, (aucj) aung);
    }

    private aung() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\t\u0001\u0004\u001a\u0005\t\u0002\u0007\t\u0004", new Object[]{"a", "b", "c", aukc.class, "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aung();
        } else {
            if (i3 == 4) {
                return new aund();
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aung.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}

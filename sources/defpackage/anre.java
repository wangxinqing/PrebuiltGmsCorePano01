package defpackage;

/* renamed from: anre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anre extends aucj implements audy {
    public static final anre o;
    private static volatile auef p;
    public int a;
    public String b = "";
    public int c;
    public anrx d;
    public ansb e;
    public anrn f;
    public anrk g;
    public anrs h;
    public anru i;
    public anrv j;
    public anra k;
    public anqz l;
    public anrc m;
    public anrh n;

    static {
        anre anre = new anre();
        o = anre;
        aucj.a(anre.class, (aucj) anre);
    }

    private anre() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\r\t\f", new Object[]{"a", "b", "c", anrd.a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i3 == 3) {
            return new anre();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (anre.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(o);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}

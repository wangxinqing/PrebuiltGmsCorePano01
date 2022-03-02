package defpackage;

/* renamed from: atbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atbr extends aucj implements audy {
    public static final atbr j;
    private static volatile auef k;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public atde e;
    public aucx f = auei.b;
    public atch g;
    public atch h;
    public atch i;

    static {
        atbr atbr = new atbr();
        j = atbr;
        aucj.a(atbr.class, (aucj) atbr);
    }

    private atbr() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0004\u001b\u0005\t\u0000\u0006\t\u0001\u0007\t\u0002\b\u001b\t\t\u0003", new Object[]{"a", "b", atck.class, "c", atbn.class, "d", atco.class, "e", "g", "h", "f", atdp.class, "i"});
        } else if (i3 == 3) {
            return new atbr();
        } else {
            if (i3 == 4) {
                return new aucd((char[][][]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atbr.class) {
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

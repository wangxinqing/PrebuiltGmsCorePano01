package defpackage;

/* renamed from: atdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atdl extends aucj implements audy {
    public static final atdl j;
    private static volatile auef k;
    public int a;
    public long b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g = 1;
    public aucx h = auei.b;
    public atce i;

    static {
        atdl atdl = new atdl();
        j = atdl;
        aucj.a(atdl.class, (aucj) atdl);
    }

    private atdl() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\f\u0003\u0005\f\u0004\u0007\f\u0006\n\u001b\f\t\b", new Object[]{"a", "b", "c", "d", "e", atdj.a, "f", atdh.a, "g", atdf.a, "h", atca.class, "i"});
        } else if (i3 == 3) {
            return new atdl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atdl.class) {
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

package defpackage;

/* renamed from: atqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atqj extends aucj implements audy {
    public static final atqj j;
    private static volatile auef k;
    public int a;
    public atov b;
    public atov c;
    public long d;
    public String e = "";
    public atoz f;
    public atpr g;
    public atov h;
    public String i = "";

    static {
        atqj atqj = new atqj();
        j = atqj;
        aucj.a(atqj.class, (aucj) atqj);
    }

    private atqj() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0002\u0002\u0004\b\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\b\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new atqj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atqj.class) {
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

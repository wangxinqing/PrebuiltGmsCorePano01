package defpackage;

/* renamed from: atco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atco extends aucj implements audy {
    public static final atco r;
    private static volatile auef s;
    public int a;
    public long b;
    public atda c;
    public atcu d;
    public atbx e;
    public atcn f;
    public atbj g;
    public atbw h;
    public aucx i = auei.b;
    public ataz j;
    public atcr k;
    public atcb l;
    public atds m;
    public atcp n;
    public atci o;
    public atbp p;
    public atdo q;

    static {
        atco atco = new atco();
        r = atco;
        aucj.a(atco.class, (aucj) atco);
    }

    private atco() {
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
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\u001b\t\t\u0007\n\t\b\u000b\t\t\f\t\n\r\t\u000b\u000e\t\f\u000f\t\r\u0010\t\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", aten.class, "j", "k", "l", "m", "n", "o", "p", "q"});
        } else if (i3 == 3) {
            return new atco();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][]) null, (char[][][]) null);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (atco.class) {
                    auef = s;
                    if (auef == null) {
                        auef = new auce(r);
                        s = auef;
                    }
                }
            }
            return auef;
        }
    }
}

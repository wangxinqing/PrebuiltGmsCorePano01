package defpackage;

/* renamed from: atyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atyx extends aucj implements audy {
    public static final atyx n;
    private static volatile auef o;
    public int a;
    public atyi b;
    public auay c = auay.b;
    public atzf d;
    public atzn e;
    public atzn f;
    public atzn g;
    public atzn h;
    public aucx i = auei.b;
    public aucx j = auei.b;
    public atzn k;
    public atyj l;
    public atyj m;

    static {
        atyx atyx = new atyx();
        n = atyx;
        aucj.a(atyx.class, (aucj) atyx);
    }

    private atyx() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0002\u0000\u0001\n\u0001\u0004\t\u0004\u0005\t\u0007\u0006\t\b\u0007\t\t\b\u001b\t\u001b\n\t\n\u000b\t\u000b\f\t\f\u000f\t\u0000\u0011\t\u0006", new Object[]{"a", "c", "d", "f", "g", "h", "i", atzm.class, "j", atzn.class, "k", "l", "m", "b", "e"});
        } else if (i3 == 3) {
            return new atyx();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (atyx.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}

package defpackage;

/* renamed from: awfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awfk extends aucj implements audy {
    public static final awfk l;
    private static volatile auef m;
    public int a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public int f;
    public String g = "";
    public int h;
    public int i;
    public int j;
    public String k = "";

    static {
        awfk awfk = new awfk();
        l = awfk;
        aucj.a(awfk.class, (aucj) awfk);
    }

    private awfk() {
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
            return aucj.a((audx) l, "\u0000\u000b\u0000\u0000\u0001\f\u000b\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0002\u0005\u0002\u0006\u0004\bȈ\t\u0004\n\u0004\u000b\u0004\fȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new awfk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (awfk.class) {
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

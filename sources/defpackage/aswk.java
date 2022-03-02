package defpackage;

/* renamed from: aswk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aswk extends aucj implements audy {
    public static final aswk l;
    private static volatile auef m;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;

    static {
        aswk aswk = new aswk();
        l = aswk;
        aucj.a(aswk.class, (aucj) aswk);
    }

    private aswk() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0004\u0005\u0007\u0007\u0006\b\f\u0007\t\u0007\b\n\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", atfc.b(), "j", "k"});
        } else if (i3 == 3) {
            return new aswk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aswk.class) {
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

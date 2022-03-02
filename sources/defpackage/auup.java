package defpackage;

/* renamed from: auup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auup extends aucj implements audy {
    public static final auup h;
    private static volatile auef i;
    public int a;
    public boolean b;
    public int c;
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        auup auup = new auup();
        h = auup;
        aucj.a(auup.class, (aucj) auup);
    }

    private auup() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\b\u0002\u0003\u0007\u0003\u0004\u0004\u0001\u0005\u0007\u0005\u0006\u0007\u0004", new Object[]{"a", "b", "d", "e", "c", "g", "f"});
        } else if (i3 == 3) {
            return new auup();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (auup.class) {
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

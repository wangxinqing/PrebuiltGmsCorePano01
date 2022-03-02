package defpackage;

/* renamed from: bby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bby extends aucj implements audy {
    public static final bby h;
    private static volatile auef i;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public bca f;
    public boolean g = true;

    static {
        bby bby = new bby();
        h = bby;
        aucj.a(bby.class, (aucj) bby);
    }

    private bby() {
        auei auei = auei.b;
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001e\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0004\u0002\u0004\f\u0002\u0002d\t\re\u0007\u000e", new Object[]{"a", "b", "c", "e", "d", "f", "g"});
        } else if (i3 == 3) {
            return new bby();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (bby.class) {
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

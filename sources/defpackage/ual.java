package defpackage;

/* renamed from: ual  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ual extends aucj implements audy {
    public static final ual k;
    private static volatile auef l;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    public int e;
    public int f;
    public String g = "";
    public int h;
    public long i;
    public long j;

    static {
        ual ual = new ual();
        k = ual;
        aucj.a(ual.class, (aucj) ual);
    }

    private ual() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0004\b\u0002\n\u0004\u0003\u000b\u0004\u0004\f\b\u0005\r\u0004\u0006\u000e\u0002\u0007\u000f\u0002\b", new Object[]{"a", "b", "c", avbx.b(), "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new ual();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (ual.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}

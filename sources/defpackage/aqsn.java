package defpackage;

/* renamed from: aqsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsn extends aucj implements audy {
    public static final aqsn k;
    private static volatile auef l;
    public int a;
    public int b;
    public aqqq c;
    public aqqr d;
    public String e = "";
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;

    static {
        aqsn aqsn = new aqsn();
        k = aqsn;
        aucj.a(aqsn.class, (aucj) aqsn);
    }

    private aqsn() {
        auei auei = auei.b;
        this.j = "";
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\b\u0003\u0006\u0004\u0004\u0007\u0007\u0006\t\u0007\b\r\u0007\n\u000e\b\u000b", new Object[]{"a", "b", aqse.a, "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new aqsn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aqsn.class) {
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

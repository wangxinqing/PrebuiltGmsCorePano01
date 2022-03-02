package defpackage;

/* renamed from: aqms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqms extends aucj implements audy {
    public static final aqms m;
    private static volatile auef n;
    public int a;
    public int b;
    public int c;
    public aqly d;
    public aqlv e;
    public aqlx f;
    public aqlz g;
    public int h;
    public String i = "";
    public boolean j;
    public String k = "";
    public aqmf l;

    static {
        aqms aqms = new aqms();
        m = aqms;
        aucj.a(aqms.class, (aucj) aqms);
    }

    private aqms() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001\f\u0000\u0004\t\u0004\u0005\t\u0005\u0006\u0004\b\u0007\b\t\b\u0007\n\t\b\u000b\n\f\u0001\u000b\t\u0006\f\t\u0007\r\t\f", new Object[]{"a", "b", aqmn.a, "d", "e", "h", "i", "j", "k", "c", aqmm.a, "f", "g", "l"});
        } else if (i3 == 3) {
            return new aqms();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (aqms.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}

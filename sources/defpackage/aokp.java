package defpackage;

/* renamed from: aokp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aokp extends aucj implements audy {
    public static final aokp o;
    private static volatile auef p;
    public int a;
    public aokg b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;
    public boolean g;
    public aokn h;
    public aoko i;
    public long j = -1;
    public aucs k = aucl.b;
    public boolean l;
    public boolean m;
    public String n = "";

    static {
        aokp aokp = new aokp();
        o = aokp;
        aucj.a(aokp.class, (aucj) aokp);
    }

    private aokp() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\b\u000e\u0002\f\u0001\u0003\b\u0002\u0004\u0004\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\t\u0000\b\t\u0006\t\t\u0007\n\u0002\b\u000b\u001e\f\u0007\f\r\u0007\r", new Object[]{"a", "n", "c", aomx.b(), "d", "e", "f", "g", "b", "h", "i", "j", "k", aomv.b(), "l", "m"});
        } else if (i3 == 3) {
            return new aokp();
        } else {
            if (i3 == 4) {
                return new aucd((int[][]) null, (int[][][]) null);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (aokp.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(o);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}

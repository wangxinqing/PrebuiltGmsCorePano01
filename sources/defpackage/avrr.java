package defpackage;

/* renamed from: avrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avrr extends aucg implements audy {
    public static final avrr q;
    private static volatile auef s;
    public int a;
    public long b;
    public long c;
    public avrf d;
    public int e = -1;
    public String f = "";
    public String g = "";
    public aucx h = auei.b;
    public aucx i = auei.b;
    public int j;
    public int k;
    public avri l;
    public avrj n;
    public avrg o;
    public int p;
    private byte r = 2;

    static {
        avrr avrr = new avrr();
        q = avrr;
        aucj.a(avrr.class, (aucj) avrr);
    }

    private avrr() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.r);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.r = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) q, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0002\u0002\u0001Љ\u0002\u0002\f\u0003\u0003Л\u0004\u0002\u0000\u0005\u001c\u0006\b\u0004\u0007\b\u0005\b\u0002\u0001\t\f\u0007\n\f\b\u000b\t\t\f\t\n\r\t\u000b\u0010\u000b\f", new Object[]{"a", "d", "e", avrp.b(), "h", avrm.class, "b", "i", "f", "g", "c", "j", avsd.b(), "k", avrq.a, "l", "n", "o", "p"});
        } else if (i3 == 3) {
            return new avrr();
        } else {
            if (i3 == 4) {
                return new aucf(q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (avrr.class) {
                    auef = s;
                    if (auef == null) {
                        auef = new auce(q);
                        s = auef;
                    }
                }
            }
            return auef;
        }
    }
}

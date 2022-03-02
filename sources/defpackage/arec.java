package defpackage;

/* renamed from: arec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arec extends aucj implements audy {
    public static final arec q;
    private static volatile auef r;
    public int a;
    public arei b;
    public arej c;
    public arfi d;
    public arek e;
    public arfk f;
    public areh g;
    public arfd h;
    public arex i;
    public aree j;
    public arel k;
    public areb l;
    public arfa m;
    public arfw n;
    public arfm o;
    public arfl p;

    static {
        arec arec = new arec();
        q = arec;
        aucj.a(arec.class, (aucj) arec);
    }

    private arec() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\u000e\t\r\u000f\t\u000e\u0010\t\u000f\u0011\t\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new arec();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (arec.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(q);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}

package defpackage;

/* renamed from: anpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anpd extends aucj implements audy {
    public static final anpd q;
    private static volatile auef r;
    public int a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public anpy g;
    public long h;
    public long i;
    public long j;
    public long k;
    public String l = "";
    public aucx m = auei.b;
    public aucx n = auei.b;
    public boolean o;
    public anpf p;

    static {
        anpd anpd = new anpd();
        q = anpd;
        aucj.a(anpd.class, (aucj) anpd);
    }

    private anpd() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0002\u0000\u0001\u0002\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\t\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\b\n\f\u001a\r\u001a\u000e\u0007\u000b\u000f\t\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new anpd();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (short[][][]) null);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (anpd.class) {
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

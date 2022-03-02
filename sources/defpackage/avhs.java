package defpackage;

/* renamed from: avhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avhs extends aucj implements audy {
    public static final avhs m;
    private static volatile auef n;
    public int a;
    public avjt b;
    public avjl c;
    public avjp d;
    public avhm e;
    public avip f;
    public avjy g;
    public avkb h;
    public avix i;
    public avir j;
    public avia k;
    public avjw l;

    static {
        avhs avhs = new avhs();
        m = avhs;
        aucj.a(avhs.class, (aucj) avhs);
    }

    private avhs() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0002\u0013\u000b\u0000\u0000\u0000\u0002\t\u0000\u0003\t\u0001\u0004\t\u0002\u0005\t\u0003\b\t\u0006\t\t\u0007\u000b\t\t\u000f\t\r\u0010\t\u000e\u0011\t\u000f\u0013\t\u0011", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new avhs();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (avhs.class) {
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

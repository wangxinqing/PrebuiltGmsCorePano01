package defpackage;

/* renamed from: avuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avuq extends aucj implements audy {
    public static final avuq l;
    private static volatile auef m;
    public int a;
    public long b;
    public int c;
    public int d;
    public String e = "";
    public avtz f;
    public int g;
    public int h;
    public int i;
    public String j = "";
    public boolean k;

    static {
        avuq avuq = new avuq();
        l = avuq;
        aucj.a(avuq.class, (aucj) avuq);
    }

    private avuq() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001\u0005\u0000\u0002\u0004\u0001\u0004\b\u0004\u0005\t\u0005\u0006\f\u0006\u0007\f\u0007\b\u0004\u0002\t\u0004\b\n\b\t\f\u0007\u000b", new Object[]{"a", "b", "c", "e", "f", "g", avup.b(), "h", avup.b(), "d", "i", "j", "k"});
        } else if (i3 == 3) {
            return new avuq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (avuq.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

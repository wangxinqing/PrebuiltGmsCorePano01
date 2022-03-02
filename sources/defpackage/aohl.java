package defpackage;

/* renamed from: aohl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aohl extends aucj implements audy {
    public static final aohl u;
    private static volatile auef v;
    public int a;
    public aohg b;
    public aoip c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public boolean i;
    public aogj j;
    public int k;
    public aohk l;
    public aogx m;
    public aohw n;
    public aohq o;
    public aucx p = auei.b;
    public aucx q = auei.b;
    public aucx r = auei.b;
    public aogn s;
    public aucx t = auei.b;

    static {
        aohl aohl = new aohl();
        u = aohl;
        aucj.a(aohl.class, (aucj) aohl);
    }

    private aohl() {
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
            return aucj.a((audx) u, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\t\u0000\u0001\t\u0000\u0002\t\u0001\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u0007\u0003\t\u001b\n\t\u0004\u000b\u0004\u0005\f\t\u0006\r\t\u0007\u000e\t\b\u0010\t\t\u0011\u001b\u0012\u001b\u0013\u001b\u0014\t\n\u0015\u001b", new Object[]{"a", "b", "c", "d", aoht.class, "e", aohi.class, "f", aoia.class, "g", aoho.class, "i", "h", aoge.class, "j", "k", "l", "m", "n", "o", "p", aoid.class, "q", aohu.class, "r", aohs.class, "s", "t", aogf.class});
        } else if (i3 == 3) {
            return new aohl();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (byte[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return u;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (aohl.class) {
                    auef = v;
                    if (auef == null) {
                        auef = new auce(u);
                        v = auef;
                    }
                }
            }
            return auef;
        }
    }
}

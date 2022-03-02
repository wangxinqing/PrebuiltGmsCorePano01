package defpackage;

/* renamed from: aoge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoge extends aucj implements audy {
    public static final aoge m;
    private static volatile auef n;
    public int a;
    public long b;
    public int c;
    public String d = "";
    public long e;
    public long f;
    public long g;
    public aucx h = auei.b;
    public int i;
    public long j;
    public String k = "com.google.android.gms";
    public float l;

    static {
        aoge aoge = new aoge();
        m = aoge;
        aucj.a(aoge.class, (aucj) aoge);
    }

    private aoge() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u001a\b\u0004\u0006\t\u0002\u0007\n\b\b\u000b\u0001\t", new Object[]{"a", "b", "c", aogd.a, "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new aoge();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[]) null, (char[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (aoge.class) {
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

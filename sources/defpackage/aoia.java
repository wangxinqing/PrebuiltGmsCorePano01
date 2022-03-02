package defpackage;

/* renamed from: aoia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoia extends aucj implements audy {
    public static final aoia o;
    private static volatile auef p;
    public int a;
    public long b;
    public int c;
    public long d;
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;
    public aucx i = auei.b;
    public aucx j = auei.b;
    public String k = "";
    public long l = -1;
    public float m;
    public boolean n;

    static {
        aoia aoia = new aoia();
        o = aoia;
        aucj.a(aoia.class, (aucj) aoia);
    }

    private aoia() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\b\u0003\u0005\u0002\u0006\u0006\u001a\b\b\u0004\t\b\b\n\u0002\t\u000b\u0001\n\f\b\u0005\r\u001b\u000e\u0007\u000b", new Object[]{"a", "b", "c", aohy.a, "d", "e", "h", "i", "f", "k", "l", "m", "g", "j", aohz.class, "n"});
        } else if (i3 == 3) {
            return new aoia();
        } else {
            if (i3 == 4) {
                return new aucd((int[]) null, (char[]) null);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (aoia.class) {
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

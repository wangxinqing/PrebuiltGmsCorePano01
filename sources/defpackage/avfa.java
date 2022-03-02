package defpackage;

/* renamed from: avfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfa extends aucj implements audy {
    public static final avfa f;
    public static final auci g;
    private static volatile auef h;
    public int a;
    public avgk b;
    public avga c;
    public avfo d;
    public long e;

    static {
        avfa avfa = new avfa();
        f = avfa;
        aucj.a(avfa.class, (aucj) avfa);
        amdz amdz = amdz.a;
        avfa avfa2 = f;
        g = aucj.a((audx) amdz, (Object) avfa2, (audx) avfa2, 84453462, aufw.MESSAGE);
    }

    private avfa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0000\u0003\t\u0001\u0004\t\u0002\u0006\u0002\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new avfa();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avfa.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}

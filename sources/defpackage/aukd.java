package defpackage;

/* renamed from: aukd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aukd extends aucj implements audy {
    public static final aukd h;
    private static volatile auef j;
    public int a = 0;
    public Object b;
    public aukh c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public int f = 30;
    public boolean g;
    private int i;

    static {
        aukd aukd = new aukd();
        h = aukd;
        aucj.a(aukd.class, (aucj) aukd);
    }

    private aukd() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\u001a\u0004<\u0000\u0005\u000b\u0002\b\u0007\u0005", new Object[]{"b", "a", "i", "c", "d", aujy.class, "e", aula.class, "f", "g"});
        } else if (i3 == 3) {
            return new aukd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aukd.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}

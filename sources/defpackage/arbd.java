package defpackage;

/* renamed from: arbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbd extends aucj implements audy {
    public static final arbd k;
    private static volatile auef l;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public aucx e = auei.b;
    public boolean f;
    public long g;
    public String h = "";
    public aucx i = auei.b;
    public String j = "";

    static {
        arbd arbd = new arbd();
        k = arbd;
        aucj.a(arbd.class, (aucj) arbd);
    }

    private arbd() {
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
            return aucj.a((audx) k, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0002\u0000\u0001\u0004\u0003\u0004\u0004\u0004\u0006\u0007\u0007Ț\b\u0002\t\u0007\nȚ\u000bȈ\fȈ", new Object[]{"a", "b", "c", "d", "e", "g", "f", "i", "h", "j"});
        } else if (i3 == 3) {
            return new arbd();
        } else {
            if (i3 == 4) {
                return new aucd((short[][][]) null, (char[][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (arbd.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}

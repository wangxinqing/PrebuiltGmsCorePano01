package defpackage;

/* renamed from: vig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vig extends aucj implements audy {
    public static final vig l;
    private static volatile auef m;
    public int a;
    public vii b;
    public String c = "";
    public String d = "";
    public aucx e = auei.b;
    public aucx f = auei.b;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public boolean k;

    static {
        vig vig = new vig();
        l = vig;
        aucj.a(vig.class, (aucj) vig);
    }

    private vig() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001\t\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u001a\u0005\u001a\u0006\u0007\u0003\u0007\u0007\u0004\b\u0007\u0005\t\u0002\u0006\n\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new vig();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (vig.class) {
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

package defpackage;

/* renamed from: auoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auoh extends aucj implements audy {
    public static final auoh l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public aucx e = auei.b;
    public int f = 3;
    public boolean g;
    public aunt h;
    public auoa i;
    public int j;
    public int k;

    static {
        auoh auoh = new auoh();
        l = auoh;
        aucj.a(auoh.class, (aucj) auoh);
    }

    private auoh() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u001a\u0005\f\u0003\u0006\u0007\u0004\u0007\t\u0005\b\t\u0006\t\f\u0007\n\f\b", new Object[]{"a", "b", auod.a, "c", auob.a, "d", "e", "f", auof.a, "g", "h", "i", "j", auod.a, "k", auob.a});
        } else if (i3 == 3) {
            return new auoh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (auoh.class) {
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

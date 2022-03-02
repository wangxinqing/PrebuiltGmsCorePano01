package defpackage;

/* renamed from: atkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atkm extends aucj implements audy {
    public static final atkm j;
    private static volatile auef k;
    public int a;
    public int b;
    public long c;
    public int d;
    public String e = "";
    public String f = "";
    public auay g = auay.b;
    public long h;
    public int i;

    static {
        atkm atkm = new atkm();
        j = atkm;
        aucj.a(atkm.class, (aucj) atkm);
    }

    private atkm() {
        aucl aucl = aucl.b;
        auei auei = auei.b;
        this.h = -1;
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\b\u0003\u0005\b\u0004\u0006\n\u0005\t\u0002\u0006\f\u0004\t", new Object[]{"a", "b", atkk.a, "c", "d", atki.a, "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new atkm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atkm.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}

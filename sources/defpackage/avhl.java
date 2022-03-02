package defpackage;

/* renamed from: avhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avhl extends aucj implements audy {
    public static final avhl k;
    private static volatile auef l;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public aucx i = auei.b;
    public aucx j = auei.b;

    static {
        avhl avhl = new avhl();
        k = avhl;
        aucj.a(avhl.class, (aucj) avhl);
    }

    private avhl() {
        auei auei = auei.b;
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
            return aucj.a((audx) k, "\u0001\n\u0000\u0000\u0005\u0011\n\u0000\n\u0000\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\u000b\u001b\f\u001b\u000e\u001b\u000f\u001b\u0010\u001b\u0011\u001b", new Object[]{"a", avhc.class, "b", avhi.class, "c", avhe.class, "d", avhf.class, "e", avhb.class, "f", avhd.class, "g", avhh.class, "h", avhg.class, "i", avhk.class, "j", avhj.class});
        } else if (i3 == 3) {
            return new avhl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (avhl.class) {
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

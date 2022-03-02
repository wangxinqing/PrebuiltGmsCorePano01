package defpackage;

/* renamed from: aqqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqqq extends aucj implements audy {
    public static final aqqq k;
    private static volatile auef l;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aqtv e;
    public aqqi f;
    public boolean g;
    public aqpu h;
    public aqrw i;
    public boolean j;

    static {
        aqqq aqqq = new aqqq();
        k = aqqq;
        aucj.a(aqqq.class, (aucj) aqqq);
    }

    private aqqq() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0004\u001b\u0007\t\u0000\n\t\u0003\u000b\u0007\u0004\f\t\u0005\r\t\u0006\u000e\u0007\u0007", new Object[]{"a", "b", aqtm.class, "c", aqtl.class, "d", aqtk.class, "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new aqqq();
        } else {
            if (i3 == 4) {
                return new aqqp();
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aqqq.class) {
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

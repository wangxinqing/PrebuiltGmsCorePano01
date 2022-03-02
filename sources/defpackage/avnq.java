package defpackage;

/* renamed from: avnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avnq extends aucj implements audy {
    public static final avnq j;
    private static volatile auef l;
    public int a;
    public avnp b;
    public avnv c;
    public avnn d;
    public avno e;
    public avns f;
    public aucx g = auei.b;
    public avnu h;
    public avnt i;
    private byte k = 2;

    static {
        avnq avnq = new avnq();
        j = avnq;
        aucj.a(avnq.class, (aucj) avnq);
    }

    private avnq() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.k = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0001\u0001\u0001Љ\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\n\t\t\f\u001b\r\t\u000b\u000e\t\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", avnm.class, "h", "i"});
        } else if (i3 == 3) {
            return new avnq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (avnq.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(j);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}

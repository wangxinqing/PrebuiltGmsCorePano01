package defpackage;

/* renamed from: avtp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avtp extends aucj implements audy {
    public static final avtp k;
    private static volatile auef m;
    public int a;
    public avtn b;
    public auay c = auay.b;
    public aucs d = aucl.b;
    public aucx e = auei.b;
    public aucs f = aucl.b;
    public aucx g = auei.b;
    public boolean h;
    public aucx i = auei.b;
    public aucs j = aucl.b;
    private byte l = 2;

    static {
        avtp avtp = new avtp();
        k = avtp;
        aucj.a(avtp.class, (aucj) avtp);
    }

    private avtp() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0006\u0001\u0001Љ\u0000\u0002\n\u0001\u0003\u0016\u0004\u001a\u0005\u0016\u0006\u001c\u0007\u0007\u0002\b\u001a\t\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new avtp();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (avtp.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

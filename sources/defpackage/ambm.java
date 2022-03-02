package defpackage;

/* renamed from: ambm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ambm extends aucj implements audy {
    public static final ambm d;
    private static volatile auef k;
    public int a;
    public ambn b;
    public ambk c;
    private int e;
    private amai f;
    private amcc g;
    private amce h;
    private amcp i;
    private byte j = 2;

    static {
        ambm ambm = new ambm();
        d = ambm;
        aucj.a(ambm.class, (aucj) ambm);
    }

    private ambm() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) d, "\u0001\u0006\u0000\u0002\u00013\u0006\u0000\u0000\u0003\u0001\t\u0000\u0003\t\u0002\n\t\t%Љ$0Љ/3Љ2", new Object[]{"a", "e", "f", "b", "c", "g", "h", "i"});
        } else if (i3 == 3) {
            return new ambm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) d);
            }
            if (i3 == 5) {
                return d;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (ambm.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(d);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}

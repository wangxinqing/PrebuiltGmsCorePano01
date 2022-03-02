package defpackage;

/* renamed from: alnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alnc extends aucj implements audy {
    public static final alnc j;
    private static volatile auef n;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public long g;
    public String h = "";
    public aucx i = auei.b;
    private int k;
    private String l = "";
    private byte m = 2;

    static {
        alnc alnc = new alnc();
        j = alnc;
        aucj.a(alnc.class, (aucj) alnc);
    }

    private alnc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.m);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.m = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0007\b\u0006\u000b\b\n\f\u0002\u000b\u000e\b\f\u000f\u001b", new Object[]{"k", "l", "a", "b", "c", "d", "e", "f", "g", "h", "i", alnh.class});
        } else if (i3 == 3) {
            return new alnc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (alnc.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(j);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}

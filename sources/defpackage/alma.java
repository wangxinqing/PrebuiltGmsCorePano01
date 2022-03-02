package defpackage;

/* renamed from: alma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alma extends aucj implements audy {
    public static final alma i;
    private static volatile auef m;
    public String a = "";
    public String b = "";
    public String c = "";
    public long d;
    public String e = "";
    public boolean f;
    public String g = "";
    public aucx h = auei.b;
    private int j;
    private String k = "";
    private byte l = 2;

    static {
        alma alma = new alma();
        i = alma;
        aucj.a(alma.class, (aucj) alma);
    }

    private alma() {
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
            return aucj.a((audx) i, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0002\u0004\u0006\b\u0005\u0007\u0007\u0006\b\b\u0007\t\u001b", new Object[]{"j", "k", "a", "b", "c", "d", "e", "f", "g", "h", alnh.class});
        } else if (i3 == 3) {
            return new alma();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (alma.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(i);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

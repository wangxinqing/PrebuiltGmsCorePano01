package defpackage;

/* renamed from: aurp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aurp extends aucj implements audy {
    public static final aurp h;
    private static volatile auef i;
    public int a;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public long f;
    public long g;

    static {
        aurp aurp = new aurp();
        h = aurp;
        aucj.a(aurp.class, (aucj) aurp);
    }

    private aurp() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0005\u0001\b\b\u0003\t\b\u0004\n\u0002\u0005\u0010\u0002\u0006", new Object[]{"a", "b", aurr.a, "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aurp();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aurp.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}

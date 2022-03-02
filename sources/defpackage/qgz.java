package defpackage;

/* renamed from: qgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgz extends aucj implements audy {
    public static final qgz k;
    private static volatile auef l;
    public String a = "";
    public String b = "";
    public int c;
    public aucx d = auei.b;
    public int e;
    public String f = "";
    public int g;
    public String h = "";
    public auck i;
    public aucx j = auei.b;

    static {
        qgz qgz = new qgz();
        k = qgz;
        aucj.a(qgz.class, (aucj) qgz);
    }

    private qgz() {
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
            return aucj.a((audx) k, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0002\u0000\u0001Ȉ\u0002\u0004\u0003\u001b\u0005\u0004\u0006Ȉ\u0007\u0004\bȈ\t\t\n\u001b\u000bȈ", new Object[]{"a", "c", "d", qhe.class, "e", "f", "g", "h", "i", "j", qhd.class, "b"});
        } else if (i3 == 3) {
            return new qgz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (qgz.class) {
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

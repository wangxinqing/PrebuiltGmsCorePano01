package defpackage;

/* renamed from: qiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qiq extends aucj implements audy {
    public static final qiq h;
    private static volatile auef i;
    public String a = "";
    public String b = "";
    public aucx c = auei.b;
    public aucs d = aucl.b;
    public int e;
    public auay f = auay.b;
    public boolean g;

    static {
        qiq qiq = new qiq();
        h = qiq;
        aucj.a(qiq.class, (aucj) qiq);
    }

    private qiq() {
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
            return aucj.a((audx) h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0002\u0000\u0001Ȉ\u0003Ȉ\u0004Ț\u0005\u0004\u0006\n\u0007'\b\u0007", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
        } else if (i3 == 3) {
            return new qiq();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null, (boolean[][][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (qiq.class) {
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

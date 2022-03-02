package defpackage;

/* renamed from: araq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class araq extends aucj implements audy {
    public static final araq m;
    private static volatile auef n;
    public String a = "";
    public String b = "";
    public aucx c = auei.b;
    public String d = "";
    public String e = "";
    public avwj f;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public auay i = auay.b;
    public aucx j = auei.b;
    public auay k = auay.b;
    public long l;

    static {
        araq araq = new araq();
        m = araq;
        aucj.a(araq.class, (aucj) araq);
    }

    private araq() {
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
            return aucj.a((audx) m, "\u0000\f\u0000\u0000\u0001\u000e\f\u0000\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005Ȉ\u0006\t\u0007\u001b\nȚ\u000b\n\f\u001b\r\u0002\u000e\n", new Object[]{"a", "b", "c", arbg.class, "d", "e", "f", "g", arbe.class, "h", "i", "j", avwl.class, "l", "k"});
        } else if (i3 == 3) {
            return new araq();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[]) null, (float[]) null);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (araq.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}

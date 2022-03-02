package defpackage;

/* renamed from: avqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqo extends aucj implements audy {
    public static final avqo a;
    public static final auci b = aucj.a((audx) avrb.C, (Object) ansh.e, (audx) ansh.e, 21, aufw.MESSAGE);
    private static volatile auef c;

    static {
        avqo avqo = new avqo();
        a = avqo;
        aucj.a(avqo.class, (aucj) avqo);
    }

    private avqo() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new avqo();
        }
        if (i2 == 4) {
            return new aucd((aucj) a);
        }
        if (i2 == 5) {
            return a;
        }
        auef auef = c;
        if (auef == null) {
            synchronized (avqo.class) {
                auef = c;
                if (auef == null) {
                    auef = new auce(a);
                    c = auef;
                }
            }
        }
        return auef;
    }
}

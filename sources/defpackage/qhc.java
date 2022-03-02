package defpackage;

/* renamed from: qhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhc extends aucj implements audy {
    public static final qhc i;
    private static volatile auef j;
    public boolean a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public aucx g = auei.b;
    public int h;

    static {
        qhc qhc = new qhc();
        i = qhc;
        aucj.a(qhc.class, (aucj) qhc);
    }

    private qhc() {
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
            return aucj.a((audx) i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0001\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u001b\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", qhe.class, "h"});
        } else if (i3 == 3) {
            return new qhc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (qhc.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}

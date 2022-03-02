package defpackage;

/* renamed from: aqqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqqr extends aucj implements audy {
    public static final aqqr i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        aqqr aqqr = new aqqr();
        i = aqqr;
        aucj.a(aqqr.class, (aucj) aqqr);
    }

    private aqqr() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0003\u0004\b\u0004\t\b\u0005\n\b\u0006\u000b\b\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "h", "d"});
        } else if (i3 == 3) {
            return new aqqr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aqqr.class) {
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

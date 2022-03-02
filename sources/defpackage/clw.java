package defpackage;

/* renamed from: clw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clw extends aucj implements audy {
    public static final clw i;
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
        clw clw = new clw();
        i = clw;
        aucj.a(clw.class, (aucj) clw);
    }

    private clw() {
        auei auei = auei.b;
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
            return aucj.a((audx) i, "\u0000\b\u0000\u0000\u0003\u0011\b\u0000\u0000\u0000\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\bȈ\tȈ\rȈ\u0011Ȉ", new Object[]{"a", "b", "c", "f", "d", "e", "g", "h"});
        } else if (i3 == 3) {
            return new clw();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (clw.class) {
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

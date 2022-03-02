package defpackage;

/* renamed from: plf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plf extends aucj implements audy {
    public static final plf i;
    private static volatile auef j;
    public pld a;
    public int b;
    public long c;
    public int d;
    public String e = "";
    public String f = "";
    public aucx g = auei.b;
    public int h;

    static {
        plf plf = new plf();
        i = plf;
        aucj.a(plf.class, (aucj) plf);
    }

    private plf() {
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
            return aucj.a((audx) i, "\u0000\b\u0000\u0000\u0001\u000f\b\u0000\u0001\u0000\u0001\t\u0002\u0004\u0004Ȉ\u0005Ȉ\t\u001b\u000b\f\u000e\u0003\u000f\u000b", new Object[]{"a", "b", "e", "f", "g", plg.class, "d", "c", "h"});
        } else if (i3 == 3) {
            return new plf();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (boolean[]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (plf.class) {
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

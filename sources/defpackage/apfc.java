package defpackage;

/* renamed from: apfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apfc extends aucj implements audy {
    public static final apfc i;
    private static volatile auef j;
    public int a;
    public apfy b;
    public aucx c = auei.b;
    public auay d = auay.b;
    public String e = "";
    public aucx f;
    public auay g;
    public apfg h;

    static {
        apfc apfc = new apfc();
        i = apfc;
        aucj.a(apfc.class, (aucj) apfc);
    }

    private apfc() {
        aucl aucl = aucl.b;
        this.f = auei.b;
        this.g = auay.b;
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\n\u0001\u0004\b\u0002\u0006\u001b\u0007\n\u0003\t\t\u0004", new Object[]{"a", "b", "c", apfw.class, "d", "e", "f", apfj.class, "g", "h"});
        } else if (i3 == 3) {
            return new apfc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (apfc.class) {
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

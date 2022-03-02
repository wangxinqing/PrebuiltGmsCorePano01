package defpackage;

/* renamed from: aqxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxe extends aucj implements audy {
    public static final aqxe i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public aqxd c;
    public aqww d;
    public aqwp e;
    public aqwn f;
    public aqvk g;
    public String h = "";

    static {
        aqxe aqxe = new aqxe();
        i = aqxe;
        aucj.a(aqxe.class, (aucj) aqxe);
    }

    private aqxe() {
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
            return aucj.a((audx) i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\t\u0004\t\u0005\t\u0006\t\b\t\tȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new aqxe();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aqxe.class) {
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

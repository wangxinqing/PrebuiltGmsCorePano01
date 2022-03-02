package defpackage;

/* renamed from: aqqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqqn extends aucj implements audy {
    public static final aqqn k;
    private static volatile auef l;
    public int a;
    public aqrl b;
    public String c = "";
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aqtd f;
    public avoo g;
    public boolean h;
    public aqsr i;
    public aucx j = auei.b;

    static {
        aqqn aqqn = new aqqn();
        k = aqqn;
        aucj.a(aqqn.class, (aucj) aqqn);
    }

    private aqqn() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001\t\u0000\u0002\b\u0001\u0003\u001a\u0004\u001a\u0005\t\u0002\u0006\t\u0003\u0007\u0007\u0004\b\t\u0005\t\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", aqtg.class});
        } else if (i3 == 3) {
            return new aqqn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aqqn.class) {
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

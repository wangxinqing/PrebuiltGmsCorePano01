package defpackage;

/* renamed from: nni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nni extends aucj implements audy {
    public static final nni h;
    private static volatile auef i;
    public int a;
    public boolean b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;
    public long g;

    static {
        nni nni = new nni();
        h = nni;
        aucj.a(nni.class, (aucj) nni);
    }

    private nni() {
        audl audl = audl.b;
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\b\u0001\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\n\u0002\b", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new nni();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (nni.class) {
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

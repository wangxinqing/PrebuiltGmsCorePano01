package defpackage;

/* renamed from: atyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atyw extends aucj implements audy {
    public static final atyw j;
    private static volatile auef k;
    public int a;
    public atyh b;
    public String c = "";
    public aucs d = aucl.b;
    public int e;
    public int f;
    public atzv g;
    public aucx h = auei.b;
    public String i = "";

    static {
        atyw atyw = new atyw();
        j = atyw;
        aucj.a(atyw.class, (aucj) atyw);
    }

    private atyw() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u0016\u0002\f\u0002\u0003\f\u0003\u0004\t\u0004\u0005\t\u0000\u0006\b\u0001\u0007\u001b\b\b\u0005", new Object[]{"a", "d", "e", atzp.a, "f", atyv.b(), "g", "b", "c", "h", atyt.class, "i"});
        } else if (i3 == 3) {
            return new atyw();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null, (short[][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atyw.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}

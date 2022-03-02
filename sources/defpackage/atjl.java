package defpackage;

/* renamed from: atjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atjl extends aucj implements audy {
    public static final atjl k;
    private static volatile auef m;
    public int a;
    public String b = "";
    public atjw c;
    public int d;
    public int e;
    public int f;
    public atmb g;
    public atjm h;
    public aucx i = auei.b;
    public atkq j;
    private byte l = 2;

    static {
        atjl atjl = new atjl();
        k = atjl;
        aucj.a(atjl.class, (aucj) atjl);
    }

    private atjl() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0001\u0001\b\u0000\u0002\t\u0001\u0004\f\u0002\u0005\f\u0003\u0006\f\u0004\u0007\t\u0005\bЉ\u0006\t\u001a\n\t\u0007", new Object[]{"a", "b", "c", "d", atjn.a, "e", atjv.b(), "f", atjj.a, "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new atjl();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[]) null, (float[][][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (atjl.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

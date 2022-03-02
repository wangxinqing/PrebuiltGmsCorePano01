package defpackage;

/* renamed from: aojk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aojk extends aucj implements audy {
    public static final aojk C;
    private static volatile auef D;
    public int A;
    public int B;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public aucs l = aucl.b;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public aola u;
    public boolean v;
    public aokr w;
    public boolean x;
    public boolean y;
    public int z;

    static {
        aojk aojk = new aojk();
        C = aojk;
        aucj.a(aojk.class, (aucj) aojk);
    }

    private aojk() {
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
            return aucj.a((audx) C, "\u0001\u001b\u0000\u0001\u0001 \u001b\u0000\u0001\u0000\u0001\f\u0000\u0002\u0004\u0007\u0003\u0004\b\u0004\u0004\t\u0005\u0004\n\u0006\u0004\f\u0007\u0004\u000e\b\u0004\u0011\n\f\u0006\f\u0004\u000f\r\u0004\u0010\u000e\t\u0015\u000f\b\u0002\u0010\u0007\u0016\u0011\u0004\u000b\u0012\u0004\r\u0013\t\u0017\u0014\b\u0004\u0015\u0007\u0018\u0016\u0007\u0019\u0017\u0004\u001a\u0018\u0004\u001b\u0019\u0004\u0012\u001a\u0004\u0013\u001b\b\u0005\u001d\f\u001c \u001e", new Object[]{"a", "b", aolo.b(), "g", "h", "i", "j", "m", "o", "r", "f", aolp.a, "p", "q", "u", "c", "v", "k", "n", "w", "d", "x", "y", "z", "A", "s", "t", "e", "B", aone.a, "l", aolm.b()});
        } else if (i3 == 3) {
            return new aojk();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][][]) null, (char[][]) null);
            }
            if (i3 == 5) {
                return C;
            }
            auef auef = D;
            if (auef == null) {
                synchronized (aojk.class) {
                    auef = D;
                    if (auef == null) {
                        auef = new auce(C);
                        D = auef;
                    }
                }
            }
            return auef;
        }
    }
}

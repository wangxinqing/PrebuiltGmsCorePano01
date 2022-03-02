package defpackage;

/* renamed from: atck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atck extends aucj implements audy {
    public static final atck j;
    private static volatile auef k;
    public int a;
    public long b;
    public atdd c;
    public atcj d;
    public aucx e = auei.b;
    public int f = -1;
    public int g = -1;
    public long h;
    public boolean i;

    static {
        atck atck = new atck();
        j = atck;
        aucj.a(atck.class, (aucj) atck);
    }

    private atck() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u001b\u0005\u0004\u0003\u0006\u0004\u0004\u0007\u0002\u0005\b\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", atcg.class, "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new atck();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (int[][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atck.class) {
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

    public final void a() {
        if (!this.e.a()) {
            this.e = aucj.a(this.e);
        }
    }
}

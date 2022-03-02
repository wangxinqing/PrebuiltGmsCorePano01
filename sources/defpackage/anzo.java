package defpackage;

/* renamed from: anzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anzo extends aucj implements audy {
    public static final anzo i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    public boolean f;
    public long g;
    public aucx h = auei.b;

    static {
        anzo anzo = new anzo();
        i = anzo;
        aucj.a(anzo.class, (aucj) anzo);
    }

    private anzo() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0002\u0002\u0004\u0004\u0003\u0005\u0007\u0004\u0006\u0002\u0005\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", anyc.class});
        } else if (i3 == 3) {
            return new anzo();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null, (byte[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (anzo.class) {
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

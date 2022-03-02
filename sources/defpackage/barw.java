package defpackage;

/* renamed from: barw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class barw extends aucj implements audy {
    public static final barw h;
    private static volatile auef j;
    public int a;
    public long b;
    public int c;
    public aucx d = auei.b;
    public float e;
    public bart f;
    public basb g;
    private byte i = 2;

    static {
        barw barw = new barw();
        h = barw;
        aucj.a(barw.class, (aucj) barw);
    }

    private barw() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u0005\u0000\u0002Л\u0003\f\u0001\u0004\u0001\u0002\u0005\t\u0003\u0006\t\u0004", new Object[]{"a", "b", "d", barz.class, "c", barv.a, "e", "f", "g"});
        } else if (i3 == 3) {
            return new barw();
        } else {
            if (i3 == 4) {
                return new aucd((int[]) null, (float[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (barw.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void c() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}

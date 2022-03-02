package defpackage;

/* renamed from: anwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anwk extends aucj implements audy {
    public static final anwk i;
    private static volatile auef j;
    public int a;
    public anvq b;
    public anvp c;
    public anwg d;
    public anwb e;
    public anvu f;
    public anwj g;
    public aucx h = auei.b;

    static {
        anwk anwk = new anwk();
        i = anwk;
        aucj.a(anwk.class, (aucj) anwk);
    }

    private anwk() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", anvg.class});
        } else if (i3 == 3) {
            return new anwk();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[]) null, (boolean[][]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (anwk.class) {
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

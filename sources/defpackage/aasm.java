package defpackage;

/* renamed from: aasm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aasm extends aucj implements audy {
    public static final aasm l;
    private static volatile auef m;
    public int a;
    public String b = "";
    public boolean c;
    public auay d = auay.b;
    public aucx e = auei.b;
    public int f;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public aucx i = auei.b;
    public int j;
    public boolean k;

    static {
        aasm aasm = new aasm();
        l = aasm;
        aucj.a(aasm.class, (aucj) aasm);
    }

    private aasm() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0004\u0000\u0001\b\u0000\u0004\u0007\u0001\u0005\n\u0002\u0006\u001c\u0007\u0004\u0003\b\u001a\t\u001a\n\u001b\u000b\u0004\u0004\f\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", aatm.class, "j", "k"});
        } else if (i3 == 3) {
            return new aasm();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aasm.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}

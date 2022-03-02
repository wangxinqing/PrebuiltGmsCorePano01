package defpackage;

/* renamed from: adht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adht {
    private static final anaf a;

    static {
        anab h = anaf.h();
        h.a(0, 0);
        h.a(1, 1);
        h.a(2, 5);
        h.a(3, 8);
        h.a(4, 7);
        h.a(5, 4);
        h.a(6, 3);
        a = h.a();
    }

    public static int a(int i) {
        anaf anaf = a;
        Integer valueOf = Integer.valueOf(i);
        if (anaf.containsKey(valueOf)) {
            return ((Integer) a.get(valueOf)).intValue();
        }
        return 0;
    }
}

package defpackage;

/* renamed from: hmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmy {
    public static babg a(babk babk) {
        babg babg = babk.a.r;
        babg babg2 = babg.OK;
        int ordinal = babg.ordinal();
        if (ordinal == 8) {
            throw new hjm(258, b(babk), babk);
        } else if (ordinal != 14) {
            return babg;
        } else {
            throw new hjm(513, b(babk), babk);
        }
    }

    public static String b(babk babk) {
        return String.format("Error when calling the server (message: %s).", new Object[]{babk.a.s});
    }
}

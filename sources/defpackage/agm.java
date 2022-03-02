package defpackage;

/* renamed from: agm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agm {
    public static final float a(agl agl) {
        return ((agn) agl.a).b;
    }

    public static final float b(agl agl) {
        return ((agn) agl.a).a;
    }

    public static final void c(agl agl) {
        if (!agl.a()) {
            agl.a(0, 0, 0, 0);
            return;
        }
        float a = a(agl);
        float b = b(agl);
        int ceil = (int) Math.ceil((double) ago.b(a, b, agl.b()));
        int ceil2 = (int) Math.ceil((double) ago.a(a, b, agl.b()));
        agl.a(ceil, ceil2, ceil, ceil2);
    }
}

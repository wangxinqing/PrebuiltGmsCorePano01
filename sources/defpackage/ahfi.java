package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahfi extends ahfx {
    public static final ahfx a = new ahfi();

    private ahfi() {
    }

    public final /* bridge */ /* synthetic */ ahfw a(ahef ahef, String str, Executor executor, agzs agzs, ahdf ahdf) {
        amrl.a((Object) ahdf);
        ahcy ahcy = (ahcy) ahef;
        return new ahfj(str, aorl.a((Object) ahcy.a), ahgj.a(ahcy.b, ahcy.e), executor, agzs);
    }

    public final String a(ahdf ahdf) {
        amrl.a((Object) ahdf);
        return "singleproc";
    }
}

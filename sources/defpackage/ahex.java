package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahex extends ahfx {
    public static final ahfx a = new ahex();

    private ahex() {
    }

    public final /* bridge */ /* synthetic */ ahfw a(ahef ahef, String str, Executor executor, agzs agzs, ahdf ahdf) {
        amrl.a((Object) ahdf);
        ahcy ahcy = (ahcy) ahef;
        amrl.a(ahcy.d instanceof ahem);
        return new ahey(str, aorl.a((Object) ahcy.a), ahgj.a(ahcy.b, ahcy.e), executor, agzs, ((ahem) ahcy.d).a());
    }

    public final String a(ahdf ahdf) {
        amrl.a((Object) ahdf);
        return "signal";
    }
}

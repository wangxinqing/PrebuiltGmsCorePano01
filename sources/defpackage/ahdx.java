package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahdx extends ahfx {
    public static final ahfx a = new ahdx();

    private ahdx() {
    }

    public final /* bridge */ /* synthetic */ ahfw a(ahef ahef, String str, Executor executor, agzs agzs, ahdf ahdf) {
        amrl.a((Object) ahdf);
        ahcy ahcy = (ahcy) ahef;
        amrl.a(ahcy.d instanceof ahdp);
        return new ahdy(str, aorl.a((Object) ahcy.a), ahcy.b, executor, agzs, ahcy.e);
    }

    public final String a(ahdf ahdf) {
        amrl.a((Object) ahdf);
        return "multiproc";
    }
}

package defpackage;

/* renamed from: aopp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aopp extends aopr {
    public aopp(aorr aorr, aoqb aoqb) {
        super(aorr, aoqb);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        aoqb aoqb = (aoqb) obj;
        aorr a = aoqb.a(obj2);
        amrl.a((Object) a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) aoqb);
        return a;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        b((aorr) obj);
    }
}
